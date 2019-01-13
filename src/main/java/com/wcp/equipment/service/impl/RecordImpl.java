package com.wcp.equipment.service.impl;

import com.wcp.equipment.dao.RecordMapper;
import com.wcp.equipment.pojo.Record;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IRecord;
import com.wcp.equipment.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordImpl implements IRecord {
    @Autowired
    private RecordMapper recordMapper;

    @Override
    public Result<Record> createRecord(String userId, String equipmentId) {
        Record record = new Record();
        record.setId(UUID.getAccountIdByUUId());
        record.setUserid(userId);
        record.setEuipmentid(equipmentId);
        record.setStatus(0);
        int i = recordMapper.insertSelective(record);
        if (i>0){
            return new Result<Record>(record);
        }else {
            return new Result(0,"交易记录插入失败");
        }
    }

    @Override
    public Result changeStatus(String recordId, int status) {
        Result<Record> recordResult = selectRecord(recordId);
        if (recordResult.getStatus()==200){
            Record record = recordResult.getData();
            record.setStatus(status);
            int i = recordMapper.updateByPrimaryKeySelective(record);
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
    public Result<Record> selectRecord(String recordId) {
        Record record = recordMapper.selectByPrimaryKey(recordId);
        if (null!=record && !"".equals(record.getId())){
            return new Result<>(record);
        }else {
            return new Result<>(0,"查询不到该交易订单");
        }
    }
}
