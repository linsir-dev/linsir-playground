package com.linsir.core.auto;

import com.linsir.core.auto.annotation.AutoContextInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ServiceLoader;

@AutoContextInitializer
public class PlayApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ccccc"+applicationContext.getApplicationName());
        ServiceLoader<IAuthService> loaders = ServiceLoader.load(IAuthService.class);
        loaders.forEach(IAuthService::say);
    }
}
