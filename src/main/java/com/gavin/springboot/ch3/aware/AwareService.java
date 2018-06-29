package com.gavin.springboot.ch3.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author Gavin
 * @date 2018年6月29日
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        
         
    }

    @Override
    public void setBeanName(String name) {
        
         
    }

    
}
