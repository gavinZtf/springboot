package com.gavin.springboot.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;
    
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
