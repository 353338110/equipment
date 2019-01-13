package com.wcp.equipment.service;

import com.wcp.equipment.pojo.Result;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

public interface IAlipay {
    void notifyResult(HttpServletRequest request) throws Exception;
    Result precreate(@RequestParam String userId, @RequestParam String equipmentId) throws Exception;
    Result query(@RequestParam String outTradeNo) throws Exception;
}
