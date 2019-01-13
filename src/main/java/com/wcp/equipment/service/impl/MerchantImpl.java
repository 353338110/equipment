package com.wcp.equipment.service.impl;

import com.wcp.equipment.dao.MerchantMapper;
import com.wcp.equipment.pojo.Merchant;
import com.wcp.equipment.pojo.MerchantExample;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IMerchant;
import com.wcp.equipment.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantImpl implements IMerchant {
    @Autowired
    private MerchantMapper merchantMapper;

    @Override
    public Result<Merchant> query(String id) {
        Merchant merchant = merchantMapper.selectByPrimaryKey(id);
        if (null!=merchant && null!=merchant.getId()){
            return new Result<>(merchant);
        }else {
            return new Result<>(0,"查询不到merchant记录");
        }
    }

    @Override
    public Result<List<Merchant>> queryAll() {
        MerchantExample merchantExample = new MerchantExample();
        MerchantExample.Criteria criteria = merchantExample.createCriteria();;
        criteria.andIdIsNotNull();
        List<Merchant> merchants = merchantMapper.selectByExample(merchantExample);
        if (null!=merchants &&merchants.size()>0){
            return new Result<>(merchants);
        }else {
            return new Result<>(0,"查询不到商户");
        }
    }

    @Override
    public Result<Merchant> createMerchant(String equipmentId, String appId, String sign,
                                           String notifyUrl, String appAuthToken, String storeId, String merchantPrivateKey, String alipayPublicKey,int maxSuccess) {
        Merchant merchant = new Merchant();
        merchant.setId(UUID.getAccountIdByUUId());
        merchant.setAppAuthToken(appAuthToken);
        merchant.setEquimentid(equipmentId);
        merchant.setAppId(appId);
        merchant.setSign(sign);
        merchant.setNotifyUrl(notifyUrl);
        merchant.setStoreId(storeId);
        merchant.setAlipaypublickey(alipayPublicKey);
        merchant.setMerchantprivatekey(merchantPrivateKey);
        merchant.setMosttimes(maxSuccess);
        int i = merchantMapper.insertSelective(merchant);
        if (i>0){
            return new Result();
        }else {
            return new Result<>(0,"插入Merchant失败");
        }
    }

    @Override
    public Result<Merchant> changeMerchant(String merchantId,String equipmentId, String appId, String sign, String notifyUrl,
                                           String appAuthToken, String storeId, String merchantPrivateKey, String alipayPublicKey,int maxSuccess) {
        Merchant merchant = new Merchant();
        merchant.setId(merchantId);
        if (null!=appAuthToken && !"".equals(appAuthToken)){
            merchant.setAppAuthToken(appAuthToken);
        }
        if (null!=equipmentId && !"".equals(equipmentId)){
            merchant.setEquimentid(equipmentId);
        }
        if (null!=appId && !"".equals(appId)){
            merchant.setAppId(appId);
        }
        if (null!=sign && !"".equals(sign)){
            merchant.setSign(sign);
        }
        if (null!=notifyUrl && !"".equals(notifyUrl)){
            merchant.setNotifyUrl(notifyUrl);
        }
        if (null!=storeId && !"".equals(storeId)){
            merchant.setStoreId(storeId);
        }
        if (null!=alipayPublicKey && !"".equals(alipayPublicKey)){
            merchant.setAlipaypublickey(alipayPublicKey);
        }
        if (null!=merchantPrivateKey && !"".equals(merchantPrivateKey)){
            merchant.setMerchantprivatekey(merchantPrivateKey);
        }
        if (maxSuccess>0){
            merchant.setMosttimes(maxSuccess);
        }
        int i = merchantMapper.updateByPrimaryKey(merchant);
        if (i>0){
            return new Result<Merchant>(merchant);
        }else {
            return new Result<>(0,"插入Merchant失败");
        }
    }

    @Override
    public Result delete(String merchantId) {
        if (null!=merchantId && !"".equals(merchantId)){
            int i = merchantMapper.deleteByPrimaryKey(merchantId);
            if (i>0){
                return new Result();
            }else {
                return new Result<>(0,"删除Merchant失败");
            }
        }else {
            return new Result(0,"merchantId不能为空");
        }

    }

    @Override
    public Result<Merchant> queryByEquipmentId(String equipmentId) {
        if (null!=equipmentId && !"".equals(equipmentId)){
            MerchantExample merchantExample = new MerchantExample();
            MerchantExample.Criteria criteria = merchantExample.createCriteria();
            criteria.andEquimentidEqualTo(equipmentId);
            List<Merchant> merchants = merchantMapper.selectByExample(merchantExample);
            if (null!=merchants && merchants.size()>0){
                return new Result<Merchant>(merchants.get(0));
            }else {
                return new Result<>(0,"Merchant没有这个装备Id的记录");
            }
        }else {
            return new Result(0,"equipmentId不能为空");
        }
    }

    @Override
    public Result<Merchant> addSuccessTimes(String id) {
        Merchant merchant = merchantMapper.selectByPrimaryKey(id);
        int successTimes = merchant.getSuccesstimes()+1;
        merchant.setSuccesstimes(successTimes);
        merchantMapper.updateByPrimaryKeySelective(merchant);
        return new Result<>(merchant);
    }
}
