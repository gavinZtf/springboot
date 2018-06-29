package com.gavin.springboot.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
@Configuration
@ComponentScan("com.gavin.springboot.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod="init", destroyMethod="destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    
    @Bean(initMethod="init", destroyMethod="destroy")
    JSR250WayService jSR250WayService(){
        return new JSR250WayService();
    }
}
