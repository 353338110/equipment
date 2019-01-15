package com.wcp.equipment.service;

import com.wcp.equipment.pojo.MerchantInfo;
import com.wcp.equipment.pojo.Result;

import java.util.List;

public interface IMerchantInfo {
    Result<MerchantInfo> query(String id);
    Result<MerchantInfo> queryByAll(String id);
    Result<List<MerchantInfo>> queryAll();
    Result<List<MerchantInfo>> queryAllByAll();
    Result<MerchantInfo> createMerchant(MerchantInfo merchantInfo);


    Result<MerchantInfo> changeMerchant(MerchantInfo merchantInfo);

    Result delete(String merchantInfoId);

    Result<MerchantInfo> addSuccessAmount(String id,int amount);
}
