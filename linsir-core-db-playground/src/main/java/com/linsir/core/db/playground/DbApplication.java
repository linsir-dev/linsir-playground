package com.linsir.core.db.playground;


import com.linsir.core.launch.LinsirApplication;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;


/**
 * description：启动类
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/17 14:17
 */
@ComponentScan(basePackages = "com.linsir")
@SpringBootApplication(scanBasePackages = "com.linsir")
public class DbApplication {


    public static void main(String[] args){
        LinsirApplication.run("db-core", DbApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            // 排列
            Arrays.sort(beanNames);
            String message = "no";
            for (String beanName : beanNames) {
                System.out.println(beanName);
                // 判断是否包含
                if ("helloController".equals(beanName)){
                    message = "yes";
                    break;
                }
            }
            System.out.println(message);
        };
    }
}
