package com.gavin.springboot.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gavin
 * @date 2018年7月2日
 */
public class Main {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new 
            AnnotationConfigApplicationContext(DemoConfig.class);
        
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        
        context.close();
    }
}
