package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DictDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 18:13
 */
@Slf4j
@RestController
@RequestMapping("/dict/")
public class DictDemoController extends BaseCrudRestController<DictDemo> {

}