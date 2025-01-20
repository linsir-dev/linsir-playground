package com.linsir.auto.playground.init;

import com.linsir.auto.playground.autoService.IAutoService;
import com.linsir.core.auto.annotation.AutoContextInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ServiceLoader;

@AutoContextInitializer
public class AutoApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(".................Initializing application context");
        System.out.println("这里可以写，再服务启动的时候，执行的内容");
        ServiceLoader.load(IAutoService.class).forEach(IAutoService::sayHello);
    }
}
