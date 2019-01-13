package com.wcp.equipment.service;

import com.wcp.equipment.pojo.Record;
import com.wcp.equipment.pojo.Result;

public interface IRecord {

    Result<Record> createRecord(String userId,String equipmentId) ;

    Result changeStatus(String recordId,int status);

    Result<Record> selectRecord(String recordId);






}
