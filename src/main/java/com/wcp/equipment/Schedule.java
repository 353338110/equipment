package com.wcp.equipment;

import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.service.IMerchantInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class Schedule {

    /**
     * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
     * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
     * @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
     * @Scheduled(cron="")通过cron表达式定义规则
     * 注意，这里的时间，单位是毫秒，1秒=1000毫秒
     */

    @Autowired
    IMerchantInfo iMerchantInfo;

    //@Scheduled(initialDelay=10000, fixedRate=10000)
    @Scheduled(cron = "0 0 0 1-2 * ? ")
    public void logTime(){
        Result result = iMerchantInfo.amount2Zero();
        log.info("定时任务，现在时间："+new Date());
        log.info(result.getMessage());


    }
}
