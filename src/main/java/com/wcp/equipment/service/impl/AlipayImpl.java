package com.wcp.equipment.service.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.google.gson.JsonObject;
import com.wcp.equipment.pojo.*;
import com.wcp.equipment.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
@Slf4j
public class AlipayImpl implements IAlipay {

    /**
     * trade_no  支付宝交易号
     * out_trade_no 商家订单号
     */

    @Autowired
    private IUser iUser;
    @Autowired
    private IEquipment iEquipment;
    @Autowired
    private IRecord iRecord;

    @Autowired
    private IMerchant iMerchant;
    //支付宝公钥
    @Value("${alipay.alipayPublicKey}")
    private String alipayPublicKey;
    //请求网关
    @Value("${alipay.gatewayUrl}")
    private String gatewayUrl;

    private AlipayClient alipayClient;


    @Override
    public void notifyResult(HttpServletRequest request) throws Exception{
        log.info("支付信息回调");
        log.info(request.toString());

        Map<String, String> params = new HashMap<String, String>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }
        System.err.println(params);
        String CHARSET = "UTF-8";
        //支付宝公钥
        String ALIPAY_PUBLIC_KEY = alipayPublicKey;
        String tradeStatus = request.getParameter("trade_status");
        boolean flag = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY, CHARSET, "RSA2");
        if (flag) {
            //验证成功
            if (tradeStatus.equals("TRADE_FINISHED") || tradeStatus.equals("TRADE_SUCCESS")) {
                //要写的逻辑。自己按自己的要求写
                Result<Record> recordResult = iRecord.selectRecord(params.get("out_trade_no"));
                if (recordResult.getStatus()==200){
                    String equipmentId = recordResult.getData().getEuipmentid();
                    Result<Merchant> merchantResult = iMerchant.queryByEquipmentId(equipmentId);
                    if (null!=merchantResult && merchantResult.getStatus() == 200){
                        iMerchant.addSuccessTimes(merchantResult.getData().getId());
                        iRecord.changeStatus(recordResult.getData().getId(),1);
                        //todo 支付成功，可以通知别的服务器了
                        log.info("支付成功，可以通知别的服务器了");
                    }else {
                        log.info("支付回到中找不到商户id");
                    }

                }else {
                    log.info("支付回到中找不到此订单号："+params.get("out_trade_no"));
                }

            }
            log.info("支付宝验证成功");
        } else {
            //验证失败
            log.info("支付宝验证失败");
        }
    }

    @Override
    public Result precreate(String userId, String equipmentId) throws Exception{
        User user;
        Equipment equipment;
        Merchant merchant ;
        if (null != userId && !"".equals(userId)) {
            user = iUser.selectUser(userId).getData();
        } else {
            return new Result(0, "用户Id不能为空");
        }
        if (null != equipmentId && !"".equals(equipmentId)) {
            equipment = iEquipment.selectEquipment(equipmentId).getData();
            Result<Merchant> merchantResult = iMerchant.queryByEquipmentId(equipmentId);
            if (merchantResult.getStatus() == 200) {
                merchant = merchantResult.getData();
                //交易的成功次数不能超过MostTimes
                if (merchant.getSuccesstimes() >= merchant.getMosttimes()){
                    //交易次数超过额定，无法交易
                    return new Result(0,"交易次数达到上限，请更换购买的游戏装备");
                }
            } else {
                return new Result(0, merchantResult.getMessage());
            }
        } else {
            return new Result(0, "装备Id不能为空");
        }
        Result<Record> record = iRecord.createRecord(userId, equipmentId);
        //if (null == alipayClient) {
            alipayClient = new DefaultAlipayClient(gatewayUrl, merchant.getAppId(), merchant.getMerchantprivatekey(), "json", "utf-8",
                    merchant.getAlipaypublickey(), "RSA2");
       // }
        //创建订单记录
        JsonObject jsonParent = new JsonObject();
        jsonParent.addProperty("app_id", merchant.getAppId());
        jsonParent.addProperty("method", "alipay.trade.precreate");
        jsonParent.addProperty("format", "JSON");
        jsonParent.addProperty("charset", "utf-8");
        jsonParent.addProperty("format", "format");
        jsonParent.addProperty("sign_type", "RSA2");
        jsonParent.addProperty("sign", merchant.getSign());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        jsonParent.addProperty("timestamp", date);
        jsonParent.addProperty("version", "1.0");
        jsonParent.addProperty("notify_url", merchant.getNotifyUrl());
        jsonParent.addProperty("app_auth_token", merchant.getAppAuthToken());
        jsonParent.addProperty("out_trade_no", record.getData().getId());
        jsonParent.addProperty("total_amount", equipment.getCount());
        jsonParent.addProperty("subject", equipment.getEquipmentname());
        jsonParent.addProperty("store_id", merchant.getStoreId());
        jsonParent.addProperty("timeout_express", "90m");

        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        /*JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("out_trade_no",record.getData().getId());
        jsonObject.addProperty("total_amount",equipment.getCount());
        jsonObject.addProperty("subject",equipment.getEquipmentname());
        jsonObject.addProperty("store_id",merchant.getStoreId());
        jsonObject.addProperty("timeout_express","90m");
*/
        // jsonParent.add("biz_content",jsonParent);


        request.setBizContent(jsonParent.toString());
        request.setNotifyUrl(merchant.getNotifyUrl());
        log.info("precreate预支付创建二维码请求参数:" + jsonParent.toString());
        AlipayTradePrecreateResponse response = alipayClient.execute(request);
        if (response.isSuccess()) {
            log.info("成功生成支付宝二维码串:" + response.getQrCode());
            QRCode qrCode = new QRCode();
            qrCode.setOutTradeNo(response.getOutTradeNo());
            qrCode.setQrCode(response.getQrCode());
            return new Result(qrCode);
        } else {
            log.info("支付宝预创建订单生产二维码串失败:" + response.getMsg());
            return new Result(0, response.getMsg());
        }
    }

    @Override
    public Result query(String outTradeNo) throws Exception{
        Result<Record> recordResult = iRecord.selectRecord(outTradeNo);
        Merchant merchant = null;
        if (recordResult.getStatus()==200 && null!=recordResult.getData()
                && null!=recordResult.getData().getEuipmentid()){
            Result<Merchant> merchantResult = iMerchant.queryByEquipmentId(recordResult.getData().getEuipmentid());
            if (merchantResult.getStatus()==200){
                merchant = merchantResult.getData();
            }else {
                return new Result(0,"该商户不存在");
            }
        }else {
            return new Result(0,"该订单不存在");
        }

        //if (null == alipayClient) {
            alipayClient = new DefaultAlipayClient(gatewayUrl, merchant.getAppId(),
                    merchant.getMerchantprivatekey(), "json", "utf-8",
                    merchant.getAlipaypublickey(), "RSA2");
        //}

        AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("out_trade_no", outTradeNo);
        /*request.setBizContent("{" +
                "\"order_no\":\"20170427000000001000000001\"" +
                "  }");*/
        request.setBizContent(jsonObject.toString());
        AlipayTradeQueryResponse response = alipayClient.execute(request);
        /**
         * trade_status
         * 	交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、
         * 	TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、
         * 	TRADE_SUCCESS（交易支付成功）、
         * 	TRADE_FINISHED（交易结束，不可退款）
         */
        log.info(response.getMsg());
        log.info(response.getSubMsg());
        log.info(response.getTradeStatus());

        if (response.isSuccess()) {
            System.out.println("调用成功");
            String message = "未知状态";
            int code  = 0;
            switch (response.getTradeStatus()){
                case "WAIT_BUYER_PAY":
                    //WAIT_BUYER_PAY（交易创建，等待买家付款）、
                    message = "交易创建，等待买家付款";
                    break;
                case "TRADE_CLOSED":
                    //TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、
                    message = "未付款交易超时关闭，或支付完成后全额退款";
                    break;
                case "TRADE_SUCCESS":
                    //TRADE_SUCCESS（交易支付成功）、
                    message = "交易支付成功";
                    code =200;
                    break;
                case "TRADE_FINISHED":
                    //TRADE_FINISHED（交易结束，不可退款）
                    message = "交易结束，不可退款";
                    break;
            }
            //return iRecord.selectRecord(response.getOutOrderNo());
            return new Result(code,message);
        } else {
            log.info(response.getSubMsg());
            return new Result(0,response.getSubMsg());
        }
    }
}
