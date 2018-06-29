package com.gavin.springboot.ch2.profile;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
public class DemoBean {
    
    public DemoBean(String content) {
        super();
        this.content = content;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
