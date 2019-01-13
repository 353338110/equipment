package com.wcp.equipment.controller;

import com.wcp.equipment.pojo.Merchant;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IMerchant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@CrossOrigin( maxAge = 3600)
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private IMerchant iMerchant;

    @RequestMapping("/query")
    @ResponseBody
    public Result<Merchant> query(String id){
        if (null!=id &&!"".equals(id)){
            return iMerchant.query(id);
        }else {
            return new Result<>(0,"商户id不能为空");
        }

    };

    @RequestMapping("/queryAll")
    @ResponseBody
    public Result<List<Merchant>> queryAll(){
        return iMerchant.queryAll();

    };

    @RequestMapping("/createMerchant")
    @ResponseBody
    public Result<Merchant> createMerchant(String equipmentId, String appId, String sign, String notifyUrl, String appAuthToken,
                                    String storeId, String merchantPrivateKey, String alipayPublicKey,int maxSuccess){
        if (null!=equipmentId &&!"".equals(equipmentId)){
            if (null!=appId &&!"".equals(appId)){
                if (null!=sign &&!"".equals(sign)){
                    if (null!=notifyUrl &&!"".equals(notifyUrl)){
                        if (null!=appAuthToken &&!"".equals(appAuthToken)){
                            if (null!=storeId &&!"".equals(storeId)){
                                if (null!=merchantPrivateKey &&!"".equals(merchantPrivateKey)){
                                    if (null!=alipayPublicKey &&!"".equals(alipayPublicKey)){
                                        return iMerchant.createMerchant(equipmentId,appId,sign,notifyUrl,appAuthToken,storeId,merchantPrivateKey,alipayPublicKey,maxSuccess);
                                    }else {
                                        return new Result<>(0,"alipayPublicKey不能为空");
                                    }
                                }else {
                                    return new Result<>(0,"merchantPrivateKey不能为空");
                                }
                            }else {
                                return new Result<>(0,"storeId不能为空");
                            }
                        }else {
                            return new Result<>(0,"appAuthToken不能为空");
                        }
                    }else {
                        return new Result<>(0,"notifyUrl不能为空");
                    }
                }else {
                    return new Result<>(0,"sign不能为空");
                }
            }else {
                return new Result<>(0,"appId不能为空");
            }
        }else {
            return new Result<>(0,"equipmentId不能为空");
        }

    };

    @RequestMapping("/changeMerchant")
    @ResponseBody
    public Result<Merchant> changeMerchant(String merchantId,String equipmentId,String appId,String sign,String notifyUrl,String appAuthToken,
                                    String storeId,String merchantPrivateKey,String alipayPublicKey,int maxSuccess){
        return iMerchant.changeMerchant(merchantId,equipmentId,appId,sign,notifyUrl,appAuthToken,storeId,merchantPrivateKey,alipayPublicKey,maxSuccess);
    };

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String merchantId){
        if (null!=merchantId &&!"".equals(merchantId)){
            return iMerchant.delete(merchantId);
        }else {
            return new Result<>(0,"merchantId不能为空");
        }
    };

}
