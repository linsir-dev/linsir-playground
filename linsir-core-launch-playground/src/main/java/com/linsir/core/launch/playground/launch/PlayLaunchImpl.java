package com.linsir.core.launch.playground.launch;


import com.linsir.core.auto.service.AutoService;
import com.linsir.core.launch.service.LauncherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.Ordered;

import java.util.Properties;

/**
 * @author ：linsir
 * @description： 实现launch，配置文件
 * @date ：2025/1/4 2:15
 */
@Slf4j
@AutoService(LauncherService.class)
public class PlayLaunchImpl implements LauncherService {
    @Override
    public void launcher(SpringApplicationBuilder builder, String appName, String profile, boolean isLocalDev) {
        Properties props = System.getProperties();
        props.setProperty("linsir.service.version","1.2.0");
        log.info("===============linsir.service.version :" + "被新定义" + " with profile: {}" , profile);
    }


}
