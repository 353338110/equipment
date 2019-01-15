package com.wcp.equipment.controller;

import com.wcp.equipment.pojo.MerchantInfo;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IMerchantInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@CrossOrigin(maxAge = 3600)
@RequestMapping("/merchantInfo")
public class MerchantInfoController {

    @Autowired
    private IMerchantInfo iMerchantInfo;

    /**
     * Result<MerchantInfo> query(String id);
     * Result<List<MerchantInfo>> queryAll();
     * Result<MerchantInfo> createMerchant(MerchantInfo merchantInfo);
     * <p>
     * <p>
     * Result<MerchantInfo> changeMerchant(MerchantInfo merchantInfo);
     * <p>
     * Result delete(String merchantInfoId);
     * <p>
     * Result<MerchantInfo> addSuccessAmount(String id,int amount);
     */

    @RequestMapping("/query")
    @ResponseBody
    public Result<MerchantInfo> query(String id) {
        if (null != id && !"".equals(id)) {
            return iMerchantInfo.query(id);
        } else {
            return new Result<>(0, "商户id不能为空");
        }

    }

    ;

    @RequestMapping("/queryAll")
    @ResponseBody
    public Result<List<MerchantInfo>> queryAll() {
        return iMerchantInfo.queryAll();

    }

    ;

    @RequestMapping("/createMerchantInfo")
    @ResponseBody
    public Result<MerchantInfo> createMerchant(MerchantInfo merchantInfo) {
        if (null != merchantInfo.getSign() && !"".equals(merchantInfo.getSign())) {
            if (null != merchantInfo.getNotifyUrl() && !"".equals(merchantInfo.getNotifyUrl())) {
                if (null != merchantInfo.getAppAuthToken() && !"".equals(merchantInfo.getAppAuthToken())) {
                    if (null != merchantInfo.getStoreId() && !"".equals(merchantInfo.getStoreId())) {
                        if (null != merchantInfo.getMerchantprivatekey() && !"".equals(merchantInfo.getMerchantprivatekey())) {
                            if (null != merchantInfo.getAlipaypublickey() && !"".equals(merchantInfo.getAlipaypublickey())) {
                                if (null != merchantInfo.getProductname() && !"".equals(merchantInfo.getProductname())) {
                                    return iMerchantInfo.createMerchant(merchantInfo);
                                } else {
                                    return new Result<>(0, "productname不能为空");
                                }
                            } else {
                                return new Result<>(0, "alipayPublicKey不能为空");
                            }
                        } else {
                            return new Result<>(0, "merchantPrivateKey不能为空");
                        }
                    } else {
                        return new Result<>(0, "storeId不能为空");
                    }
                } else {
                    return new Result<>(0, "appAuthToken不能为空");
                }
            } else {
                return new Result<>(0, "notifyUrl不能为空");
            }
        } else {
            return new Result<>(0, "sign不能为空");
        }

    }

    @RequestMapping("/changeMerchantInfo")
    @ResponseBody
    public Result<MerchantInfo> changeMerchant(MerchantInfo merchantInfo) {
        return iMerchantInfo.changeMerchant(merchantInfo);
    }

    ;

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String id) {
        if (null != id && !"".equals(id)) {
            return iMerchantInfo.delete(id);
        } else {
            return new Result<>(0, "merchantInfoId不能为空");
        }
    }


    @RequestMapping("/addAmount")
    @ResponseBody
    public Result addAmount(String id, int amount) {
        if (null != id && !"".equals(id)) {
            if (amount > 0) {
                return iMerchantInfo.addSuccessAmount(id, amount);
            } else {
                return new Result<>(0, "amount不能小于0");
            }
        } else {
            return new Result<>(0, "merchantInfoId不能为空");
        }
    }

    ;


}
