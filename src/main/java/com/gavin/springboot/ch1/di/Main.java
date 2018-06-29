 package com.gavin.springboot.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(DiConfig.class);
        
        UserFunctionService userFunctionService = 
            context.getBean(UserFunctionService.class);
        
        String word = userFunctionService.sayHello("Gavin");
        System.out.println(word);
        
        context.close();
    }
}
