package com.gavin.springboot.ch2.prepost;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
public class BeanWayService {
    
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    
    public void destroy(){
        System.out.println("@Bean-detroy-method");
    }
}
