package com.linsir.core.mybatis.playground.modules.index.controller;


import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：IndexController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/3 19:28
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public R index()
    {
        return JsonResult.OK();
    }
}
