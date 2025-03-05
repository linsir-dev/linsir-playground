package com.linsir.oauth;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：HomeController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/3/4 16:14
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public Object index() {
        return "Hello World";
    }
}
