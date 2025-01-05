package com.linsir.core.knife4j.playground;


import com.linsir.core.launch.LinsirApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：linsir
 * @description：启动类
 * @date ：2025/1/5 15:21
 */

@SpringBootApplication(scanBasePackages = "com.linsir")
public class Knife4jApplication {
    public static void main(String[] args) {
        LinsirApplication.run("aaa", Knife4jApplication.class, args);
    }
}
