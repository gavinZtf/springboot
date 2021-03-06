 package com.gavin.springboot.ch1.di.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(JavaConfig.class);
        
        FunctionService functionService = 
            context.getBean(FunctionService.class);
        
        String word = functionService.sayHello("Gavin");
        System.out.println(word);
        
        context.close();
    }
}
