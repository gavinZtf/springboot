 package com.gavin.springboot.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
@Configuration
@ComponentScan("com.gavin.springboot.ch1.aop")
@EnableAspectJAutoProxy
public class DiConfig {
    
}
