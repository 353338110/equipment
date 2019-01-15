package com.wcp.equipment.service.impl;

import com.wcp.equipment.dao.MerchantInfoMapper;
import com.wcp.equipment.pojo.MerchantInfo;
import com.wcp.equipment.pojo.MerchantInfoExample;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IMerchantInfo;
import com.wcp.equipment.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantInfoImpl implements IMerchantInfo {

    @Autowired
    private MerchantInfoMapper merchantInfoMapper;

    @Override
    public Result<MerchantInfo> query(String id) {
        MerchantInfo merchantInfo = merchantInfoMapper.selectByPrimaryKey(id);
        if (null!=merchantInfo && null!=merchantInfo.getId()){
            merchantInfo.setAlipaypublickey("");
            merchantInfo.setSign("");
            merchantInfo.setAppId("");
            merchantInfo.setAppAuthToken("");
            merchantInfo.setNotifyUrl("");
            merchantInfo.setMerchantprivatekey("");
            merchantInfo.setStoreId("");
            merchantInfo.setSuccessamount(0);
            merchantInfo.setMaxamount(0);
            return new Result<>(merchantInfo);
        }else {
            return new Result<>(0,"查询不到merchantInfo记录");
        }
    }

    @Override
    public Result<MerchantInfo> queryByAll(String id) {
        MerchantInfo merchantInfo = merchantInfoMapper.selectByPrimaryKey(id);
        if (null!=merchantInfo && null!=merchantInfo.getId()){
            return new Result<>(merchantInfo);
        }else {
            return new Result<>(0,"查询不到merchantInfo记录");
        }
    }

    @Override
    public Result<List<MerchantInfo>> queryAll() {
        MerchantInfoExample merchantExample = new MerchantInfoExample();
        MerchantInfoExample.Criteria criteria = merchantExample.createCriteria();;
        criteria.andIdIsNotNull();
        List<MerchantInfo> merchantInfos = merchantInfoMapper.selectByExample(merchantExample);
        for (MerchantInfo m:merchantInfos) {
            m.setAlipaypublickey("");
            m.setSign("");
            m.setAppId("");
            m.setAppAuthToken("");
            m.setNotifyUrl("");
            m.setMerchantprivatekey("");
            m.setStoreId("");
            m.setSuccessamount(0);
            m.setMaxamount(0);
        }
        if (null!=merchantInfos && merchantInfos.size()>0){
            return new Result<>(merchantInfos);
        }else {
            return new Result<>(0,"查询不到商户");
        }
    }

    @Override
    public Result<List<MerchantInfo>> queryAllByAll() {
        MerchantInfoExample merchantExample = new MerchantInfoExample();
        MerchantInfoExample.Criteria criteria = merchantExample.createCriteria();;
        criteria.andIdIsNotNull();
        List<MerchantInfo> merchantInfos = merchantInfoMapper.selectByExample(merchantExample);
        if (null!=merchantInfos && merchantInfos.size()>0){
            return new Result<>(merchantInfos);
        }else {
            return new Result<>(0,"查询不到商户");
        }
    }

    @Override
    public Result<MerchantInfo> createMerchant(MerchantInfo merchantInfo) {
        merchantInfo.setId(UUID.getAccountIdByUUId());
        int i = merchantInfoMapper.insertSelective(merchantInfo);
        if (i>0){
            return new Result();
        }else {
            return new Result<>(0,"插入MerchantInfo失败");
        }
    }

    @Override
    public Result<MerchantInfo> changeMerchant(MerchantInfo merchantInfo) {
        int i = merchantInfoMapper.updateByPrimaryKeySelective(merchantInfo);
        if (i>0){
            return new Result();
        }else {
            return new Result<>(0,"更新MerchantInfo失败");
        }
    }

    @Override
    public Result delete(String merchantInfoId) {
        int i = merchantInfoMapper.deleteByPrimaryKey(merchantInfoId);
        if (i>0){
            return new Result();
        }else {
            return new Result<>(0,"删除MerchantInfo失败");
        }

    }

    @Override
    public Result<MerchantInfo> addSuccessAmount(String id, int amount) {
        MerchantInfo merchantInfo = merchantInfoMapper.selectByPrimaryKey(id);
        if (null!=merchantInfo && null!=merchantInfo.getId()){
            merchantInfo.setSuccessamount(merchantInfo.getSuccessamount()+amount);
            int i = merchantInfoMapper.updateByPrimaryKey(merchantInfo);
            if (i>0){
                return new Result();
            }else {
                return new Result<>(0,"更新MerchantInfo amount失败");
            }
        }else {
            return new Result<>(0,"查询不到MerchantInfo");
        }
    }
}
