package com.linsir.core;

import com.linsir.core.launch.LinsirApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.linsir")
public class Application {

    public static void main(String[] args) {
        LinsirApplication.run("linsir-auth-server", Application.class,args);
    }
}
