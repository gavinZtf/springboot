package com.gavin.springboot.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
public class DemoEvent extends ApplicationEvent {

    /**
     *
     */
    private static final long serialVersionUID = 7824517728074442065L;
    
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @param source
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

}
