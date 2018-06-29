package com.gavin.springboot.ch1.di.javaconfig;

import org.springframework.stereotype.Service;

 /**
 * @author Gavin
 * @date 2018年6月27日
 */
@Service
public class UserFunctionService {

    private FunctionService functionService;
    
    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
