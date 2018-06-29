 package com.gavin.springboot.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(DiConfig.class);
        
        DemoAnnotationService demoAnnotationService = 
            context.getBean(DemoAnnotationService.class);
        
        DemoMethodService demoMethodService = 
            context.getBean(DemoMethodService.class);
        
        demoAnnotationService.add();
        demoMethodService.add();
        
        context.close();
    }
}
