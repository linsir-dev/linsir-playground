package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DictDemo;
import com.linsir.core.mybatis.playground.modules.example.vo.DictDemoVo;
import com.linsir.core.results.R;
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


    /**
     * 字典测试
     * @param id
     * @return
     */
    @GetMapping("getVo/{id}")
    public R getVo(@PathVariable("id") Long id)
    {
        return exec(()->getViewObject(id, DictDemoVo.class));
    }
}