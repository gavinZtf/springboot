package com.gavin.springboot.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Gavin
 * @date 2018年6月27日
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
    
}
