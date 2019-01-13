package com.wcp.equipment.controller;

import com.wcp.equipment.pojo.Record;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin( maxAge = 3600)
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private IRecord iRecord;

    @RequestMapping("/query")
    @ResponseBody
    private Result<Record> queryRecord(@RequestParam String recordId){
        if (null==recordId || !"".equals(recordId)){
            Result<Record> recordResult = iRecord.selectRecord(recordId);
            return recordResult;
        }else {
            return new Result(0,"订单记录Id不能为空");
        }
    }
}
