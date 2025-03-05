package com.linsir.oauth;


import cn.dev33.satoken.oauth2.SaOAuth2Manager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description：OAuthApplication
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/3/4 16:01
 */
@SpringBootApplication
public class OAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuthApplication.class, args);
        System.out.println("\nSa-Token-OAuth2 Server端启动成功，配置如下：");
        System.out.println(SaOAuth2Manager.getServerConfig());
    }
}
