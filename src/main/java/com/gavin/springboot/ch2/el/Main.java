package com.gavin.springboot.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gavin
 * @date 2018年6月27日
 */
public class Main {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context 
                = new AnnotationConfigApplicationContext(ElConfig.class);
        
        ElConfig elconfig = context.getBean(ElConfig.class);
        
        elconfig.outputResource();
        
        context.close();
    }
}
