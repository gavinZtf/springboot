package com.gavin.springboot.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Gavin
 * @date 2018年6月28日
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我bean-demolistener接收到了"
            + "bean-demopublisher发布的消息" + msg);
    }

}
