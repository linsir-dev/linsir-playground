package com.linsir.core.mybatis.playground.config;



import com.linsir.core.mybatis.data.protect.DataEncryptHandler;
import com.linsir.core.mybatis.data.protect.DataMaskHandler;
import com.linsir.core.mybatis.data.protect.DefaultDataEncryptHandler;
import com.linsir.core.mybatis.data.protect.DefaultDataMaskHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * description：配置
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 13:22
 */
@Configuration
@Slf4j
public class MybatisConfiguration {
    /**
     * 字典等基础数据缓存管理器
     *
     * @return
     */

    /**
     * 在自定义的加解密实现类上使用Spring注解实例化
     */
    @Bean
    public DataEncryptHandler dataEncryptHandler() {
        return new DefaultDataEncryptHandler();
    }


    /**
     *
     * * 在Spring配置类中实例化DataMaskHandler 数据脱敏展示处理器
     * @return
     */
    @Bean
    public DataMaskHandler dataMaskHandler() {
        return new DefaultDataMaskHandler();
    }

}
