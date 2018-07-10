package com.gavin.springboot.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Gavin
 * @date 2018年7月2日
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("dev");
    }
    
    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production file");
    }
}
