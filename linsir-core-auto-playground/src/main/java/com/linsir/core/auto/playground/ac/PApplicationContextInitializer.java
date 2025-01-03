package com.linsir.core.auto.playground.ac;

import com.linsir.core.auto.annotation.AutoContextInitializer;
import com.linsir.core.auto.playground.as.AutoPlayService;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ServiceLoader;


@AutoContextInitializer
public class PApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(".................Initializing application context");
        ServiceLoader<AutoPlayService> serviceLoader = ServiceLoader.load(AutoPlayService.class);
        for (AutoPlayService autoPlayService : serviceLoader) {
            autoPlayService.sayHello();
        }
    }
}
