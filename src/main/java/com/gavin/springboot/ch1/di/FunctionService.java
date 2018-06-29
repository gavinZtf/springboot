 package com.gavin.springboot.ch1.di;

import org.springframework.stereotype.Service;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello: " + word;
    }
}
