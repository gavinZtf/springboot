package com.gavin.springboot.ch3.taskschelduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Gavin
 * @date 2018年6月29日
 */
@Configuration
@ComponentScan("com.gavin.springboot.ch3.taskschelduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
