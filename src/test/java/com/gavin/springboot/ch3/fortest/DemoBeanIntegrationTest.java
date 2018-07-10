package com.gavin.springboot.ch3.fortest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Gavin
 * @date 2018年7月2日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@ActiveProfiles("prod")
public class DemoBeanIntegrationTest {

    @Autowired
    private TestBean testBean;
    
    @SuppressWarnings("deprecation")
    @Test
    public void prodBeanShouldInject(){
        String expected = "from production file";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }
}
