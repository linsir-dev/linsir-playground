package com.linsir.core.auto.playground.al;


import com.linsir.core.auto.annotation.AutoListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author ：linsir
 * @description：监听
 * @date ：2025/1/3 22:20
 */
@Slf4j
@AutoListener
public class PApplicationListener implements ApplicationListener<ApplicationEvent> {


    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("====================================================onApplicationEvent");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxPApplicationListener"+event.getSource());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }


}
