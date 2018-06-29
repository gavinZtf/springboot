package com.gavin.springboot.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
public class Main {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context 
            = new AnnotationConfigApplicationContext(EventConfig.class);
       
        DemoPublisher pulisher = context.getBean(DemoPublisher.class);
        pulisher.publish("hello application event");
        
        context.close();
    }
}
