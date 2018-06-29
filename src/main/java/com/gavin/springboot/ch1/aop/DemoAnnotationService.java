package com.gavin.springboot.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @author Gavin
 * @date 2018年6月27日
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
