package com.linsir.core.palyground;


import com.linsir.core.launch.LinsirApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * description：core 启动类
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/15 18:13
 */
@SpringBootApplication(scanBasePackages = "com.linsir")
public class CoreApplication {

    public static void main(String[] args) {
       SpringApplication.run(CoreApplication.class, args);
    }
}
