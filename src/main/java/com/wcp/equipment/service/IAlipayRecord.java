package com.wcp.equipment.service;

import com.wcp.equipment.pojo.AlipayRecord;
import com.wcp.equipment.pojo.JSPageBean;
import com.wcp.equipment.pojo.Result;

import java.util.List;

public interface IAlipayRecord {

    Result<AlipayRecord> createRecord(String userId, String username,String merchantInfoId, int amount) ;

    Result changeStatus(String id,int status,String buyer_logon_id,String seller_email);

    Result<AlipayRecord> selectRecord(String id);
    List<AlipayRecord> queryAll();

    JSPageBean<AlipayRecord> queryAllByJS(int draw, int start, int length);
}
