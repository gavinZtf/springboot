package com.gavin.springboot.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
