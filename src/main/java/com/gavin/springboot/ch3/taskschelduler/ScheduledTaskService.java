package com.gavin.springboot.ch3.taskschelduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Gavin
 * @date 2018年6月29日
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次：" + dateFormat.format(new Date()));
    }
    
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecition(){
        System.out.println("在指定时间内" + dateFormat.format(new Date()) + "执行");
    }
}
