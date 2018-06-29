 package com.gavin.springboot.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
@Service
public class UserFunctionService {

    @Autowired
    private FunctionService functionService;
    
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
