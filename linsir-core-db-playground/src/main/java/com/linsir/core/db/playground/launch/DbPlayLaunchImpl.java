package com.linsir.core.db.playground.launch;


import com.alibaba.druid.pool.DruidDataSource;
import com.linsir.core.auto.service.AutoService;
import com.linsir.core.launch.service.LauncherService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Properties;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/17 14:24
 */
@Slf4j
@AutoService(LauncherService.class)
public class DbPlayLaunchImpl implements LauncherService {

    @Resource
    DruidDataSource dataSource;

    @Override
    public void launcher(SpringApplicationBuilder builder, String appName, String profile, boolean isLocalDev) {
        Properties props = System.getProperties();
        dataSource.getRawDriver();
        props.setProperty("linsir.service.version","1.2.0");
        log.info("===============linsir.service.version :" + "被新定义" + " with profile: {}" , profile);
    }
}
