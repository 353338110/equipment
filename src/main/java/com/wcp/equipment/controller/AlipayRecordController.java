package com.wcp.equipment.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wcp.equipment.pojo.AlipayRecord;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IAlipayRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@CrossOrigin( maxAge = 3600)
@RequestMapping("/alipayRecord")
public class AlipayRecordController {

    @Autowired
    private IAlipayRecord iAlipayRecord;

    @RequestMapping("/query")
    @ResponseBody
    private Result<AlipayRecord> queryRecord(@RequestParam String id){
        if (null==id || !"".equals(id)){
            Result<AlipayRecord> recordResult = iAlipayRecord.selectRecord(id);
            return recordResult;
        }else {
            return new Result(0,"订单记录Id不能为空");
        }
    }


    @RequestMapping("/queryAll")
    @ResponseBody
    private PageInfo<AlipayRecord> queryRecordAll(int page, int row){
        PageHelper.startPage(page,row);
        List<AlipayRecord> alipayRecords = iAlipayRecord.queryAll();
        PageInfo<AlipayRecord> pageInfo = new PageInfo<AlipayRecord>(alipayRecords);

        return pageInfo;
    }

}
