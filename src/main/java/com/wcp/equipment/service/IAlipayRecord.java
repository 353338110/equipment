package com.wcp.equipment.service;

import com.wcp.equipment.pojo.AlipayRecord;
import com.wcp.equipment.pojo.Result;

import java.util.List;

public interface IAlipayRecord {

    Result<AlipayRecord> createRecord(String userId, String username,String merchantInfoId, int amount) ;

    Result changeStatus(String id,int status);

    Result<AlipayRecord> selectRecord(String id);
    List<AlipayRecord> queryAll();
}
