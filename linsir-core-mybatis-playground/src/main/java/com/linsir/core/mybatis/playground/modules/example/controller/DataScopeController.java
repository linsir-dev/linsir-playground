package com.linsir.core.mybatis.playground.modules.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DataScope;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：DataScopeController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/16 23:50
 */
@RestController
@RequestMapping("/dataScope/")
public class DataScopeController extends BaseCrudRestController<DataScope> {

    @PostMapping("add")
    public R add(DataScope dataScope) throws Exception {
        return exec(()->{
            return JsonResult.OK( createEntity(dataScope));
        });

    }

    @PostMapping("list")
    public R list()  {
        return exec(()->{
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.orderByDesc("id");
            return JsonResult.OK( getEntityList(queryWrapper));
        });

    }
}
