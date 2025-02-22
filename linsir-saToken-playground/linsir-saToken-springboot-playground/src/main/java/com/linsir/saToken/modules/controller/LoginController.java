package com.linsir.saToken.modules.controller;


import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：LoginController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/21 11:36
 */
@RestController
@RequestMapping("/")
public class LoginController {

    @PostMapping("login")
    public SaResult login(String name, String pwd) {
        // 第一步：比对前端提交的账号名称、密码
        if("zhang".equals(name) && "123456".equals(pwd)) {
            // 第二步：根据账号id，进行登录
            StpUtil.login(10001);
            return SaResult.ok("登录成功");
        }
        return SaResult.error("登录失败");
    }

    @RequestMapping("isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }
}
