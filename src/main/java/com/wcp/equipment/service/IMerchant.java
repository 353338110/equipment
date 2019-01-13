package com.wcp.equipment.service;

import com.wcp.equipment.pojo.Merchant;
import com.wcp.equipment.pojo.Result;

import java.util.List;

public interface IMerchant {

    Result<Merchant> query(String id);
    Result<List<Merchant>> queryAll();
    Result<Merchant> createMerchant(String equipmentId, String appId, String sign, String notifyUrl, String appAuthToken,
                                    String storeId, String merchantPrivateKey, String alipayPublicKey,int maxSuccess);


    Result<Merchant> changeMerchant(String merchantId,String equipmentId,String appId,String sign,String notifyUrl,String appAuthToken,
                          String storeId,String merchantPrivateKey,String alipayPublicKey,int maxSuccess);

    Result delete(String merchantId);

    Result<Merchant> queryByEquipmentId(String equipmentId);

    Result<Merchant> addSuccessTimes(String id);
}
