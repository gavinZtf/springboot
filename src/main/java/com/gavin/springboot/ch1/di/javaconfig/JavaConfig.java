 package com.gavin.springboot.ch1.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
}
