package com.gavin.springboot.ch3.fortest;

/**
 * @author Gavin
 * @date 2018年7月2日
 */
public class TestBean {

    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
