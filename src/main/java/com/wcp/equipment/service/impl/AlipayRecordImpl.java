package com.wcp.equipment.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wcp.equipment.dao.AlipayRecordMapper;
import com.wcp.equipment.pojo.AlipayRecord;
import com.wcp.equipment.pojo.AlipayRecordExample;
import com.wcp.equipment.pojo.Record;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IAlipayRecord;
import com.wcp.equipment.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlipayRecordImpl implements IAlipayRecord {
    @Autowired
    private AlipayRecordMapper alipayRecordMapper;


    @Override
    public Result<AlipayRecord> createRecord(String userId, String username,String merchantInfoId, int amount) {
        AlipayRecord record = new AlipayRecord();
        record.setId(UUID.getAccountIdByUUId());
        //record.setTradoNo(UUID.getAccountIdByUUId());
        record.setUserid(userId);
        record.setUsername(username);
        record.setAmount(amount);
        record.setMerchantinfoid(merchantInfoId);
        record.setStatus(0);
        int i = alipayRecordMapper.insertSelective(record);
        if (i>0){
            return new Result<AlipayRecord>(record);
        }else {
            return new Result(0,"交易记录插入失败");
        }
    }

    @Override
    public Result changeStatus(String id, int status) {
        Result<AlipayRecord> recordResult = selectRecord(id);
        if (recordResult.getStatus()==200){
            AlipayRecord record = recordResult.getData();
            record.setStatus(status);
            int i = alipayRecordMapper.updateByPrimaryKeySelective(record);
            if (i>0){
                return new Result();
            }else {
                return new Result(0,"交易状态修改失败");
            }
        }else {
            return new Result<>(0,recordResult.getMessage());
        }
    }

    @Override
    public Result<AlipayRecord> selectRecord(String id) {
        AlipayRecord record = alipayRecordMapper.selectByPrimaryKey(id);
        if (null!=record && !"".equals(record.getId())){
            return new Result<>(record);
        }else {
            return new Result<>(0,"查询不到该交易订单");
        }
    }

    @Override
    public List<AlipayRecord> queryAll() {
        AlipayRecordExample alipayRecordExample = new AlipayRecordExample();
        AlipayRecordExample.Criteria criteria =alipayRecordExample.createCriteria();
        criteria.andIdIsNotNull();
        return alipayRecordMapper.selectByExample(alipayRecordExample);
    }
}
