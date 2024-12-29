package com.linsir.core.auto;

import com.linsir.core.auto.annotation.AutoListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName : AuthApplicationListener
 * @Description :
 * @Author : Linsir
 * @Date: 2023-12-26 02:05
 */

@AutoListener
public class AuthApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
      System.out.println(event.getTimestamp());
    }
}
