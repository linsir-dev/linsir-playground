package com.linsir.core.db.playground;


import com.linsir.core.launch.LinsirApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description：启动类
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/17 14:17
 */
@SpringBootApplication(scanBasePackages = "com.linsir")
public class DbApplication {
    public static void main(String[] args) {
       LinsirApplication.run("db-core", DbApplication.class, args);
    }
}
