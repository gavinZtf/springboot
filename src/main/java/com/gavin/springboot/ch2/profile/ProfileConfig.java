package com.gavin.springboot.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
@Configuration
public class ProfileConfig {
    
    @Bean
    @Profile("dev")
    public DemoBean demoBean(){
        return new DemoBean("from development profile");
    }
    
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from product profile");
    }
}
