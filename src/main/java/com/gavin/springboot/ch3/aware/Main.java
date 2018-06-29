package com.gavin.springboot.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gavin
 * @date 2018年6月29日
 */
public class Main {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AwareConfig.class);
        
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        
        context.close();
    }
}
