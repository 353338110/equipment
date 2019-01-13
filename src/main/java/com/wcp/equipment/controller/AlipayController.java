package com.wcp.equipment.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IAlipay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@CrossOrigin( maxAge = 3600)
@RequestMapping("/alipay")
public class AlipayController {

    @Autowired
    private IAlipay iAlipay;


    //应用id
    @Value("${alipay.appID}")
    private String appId;
    //应用私钥
    @Value("${alipay.merchantPrivateKey}")
    private String merchantPrivateKey;
    //支付宝公钥
    @Value("${alipay.alipayPublicKey}")
    private String alipayPublicKey;
    //请求网关
    @Value("${alipay.gatewayUrl}")
    private String gatewayUrl;
    @Value("${alipay.sysServiceProviderId}")
    private String sysServiceProviderId;
    @Value("${alipay.notifyUrl}")
    private String notifyUrl;

    String sign = "sign=kPbQIjX+xQc8F0/A6/AocELIjhhZnGbcBN6G4MM/HmfWL4ZiHM6fWl5NQhzXJusaklZ1LFuMo+lHQUELAYeugH8LYFvxnNajOvZhuxNFbN2LhF0l/KL8ANtj8oyPM4NN7Qft2kWJTDJUpQOzCzNnV9hDxh5AaT9FPqRS6ZKxnzM=";


    private AlipayClient alipayClient;

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public void aliResult(HttpServletRequest request) throws  Exception{
        iAlipay.notifyResult(request);

    }

    @RequestMapping("/pay")
    @ResponseBody
    public Result alipay(HttpServletRequest request) throws Exception {
        if (null != alipayClient) {
            alipayClient = new DefaultAlipayClient(gatewayUrl, appId, merchantPrivateKey, "json", "utf-8",
                    alipayPublicKey, "RSA2");
        }
        log.info(request.toString());
        return null;
    }

    @RequestMapping(value = "/precreate")
    @ResponseBody
    public Result precreate(@RequestParam String userId, String equipmentId) throws Exception {
        return  iAlipay.precreate(userId,equipmentId);
    }

    @RequestMapping("/query")
    @ResponseBody
    public Result query(@RequestParam String order_no) throws Exception {
        return iAlipay.query(order_no);
    }
}
