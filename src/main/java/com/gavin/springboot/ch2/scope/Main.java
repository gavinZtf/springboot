package com.gavin.springboot.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gavin
 * @date 2018年6月27日
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(ScopeConfig.class);
        
        DemoSingletonService demoSingletonService1 = 
            context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = 
            context.getBean(DemoSingletonService.class);
        
        System.out.println("single:是否相等==》" + 
            demoSingletonService1.equals(demoSingletonService2));
        
        DemoPrototypeService s1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService s2 = context.getBean(DemoPrototypeService.class);
        
        System.out.println("prototype:是否相等==》" + 
            s1.equals(s2));
        
    }
}
