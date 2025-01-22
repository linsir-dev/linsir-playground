package com.linsir.core.launch.playground;


import com.linsir.core.auto.service.AutoService;
import com.linsir.core.launch.LinsirApplication;
import com.linsir.core.launch.props.LinsirProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：linsir
 * @description：启动类
 * @date ：2025/1/4 1:39
 */

@SpringBootApplication(scanBasePackages = "com.linsir")
public class LaunchApplication {

    @Autowired
    private static LinsirProperties properties;

    public static void main(String[] args) {
        LinsirApplication.run("core-play", LaunchApplication.class,args);
    }
}
