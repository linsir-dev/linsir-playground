package com.linsir.auto.playground.listener;


import com.linsir.core.auto.annotation.AutoListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * description：自动监听的代码
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/20 14:50
 */

@AutoListener
public class AutoApplicaitonListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("ApplicationEvent:"+event.getTimestamp()+"源:"+event.getSource());
    }
}
