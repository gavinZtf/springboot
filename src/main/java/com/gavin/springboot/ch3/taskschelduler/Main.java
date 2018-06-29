package com.gavin.springboot.ch3.taskschelduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gavin
 * @date 2018年6月29日
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        
//        context.close();
    }
}
