package com.linsir.core.auto.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.linsir")
public class AutoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class, args);
    }
}
