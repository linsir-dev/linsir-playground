package com.linsir.core.mybatis.playground;


import com.linsir.core.launch.LinsirApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 12:55
 */
@ComponentScan(basePackages = "com.linsir")
@SpringBootApplication(scanBasePackages = "com.linsir")
public class MybatisApplication {
    public static void main(String[] args) {
        LinsirApplication.run("mybatis-play",MybatisApplication.class, args);
    }
}
