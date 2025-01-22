package com.linsir.core.launch.playground.controller;


import com.linsir.core.launch.props.LinsirProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/21 16:20
 */
@RestController("/")
public class HomeController {

    @Autowired
    private LinsirProperties linsirProperties;


    @GetMapping("index")
    public String index() {
        return linsirProperties.getProp().get("linsir.name").toString();
    }
}
