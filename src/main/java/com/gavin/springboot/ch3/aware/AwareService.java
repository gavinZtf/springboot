package com.gavin.springboot.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author Gavin
 * @date 2018年6月29日
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    
    private ResourceLoader loader;
    
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void outputResult(){
        System.out.println("Bean的名称是：" + beanName);
        Resource resource = loader.getResource("classpath:com/gavin/springboot/ch3/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载文件的内容是：" + IOUtils.toString(resource.getInputStream()));
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
