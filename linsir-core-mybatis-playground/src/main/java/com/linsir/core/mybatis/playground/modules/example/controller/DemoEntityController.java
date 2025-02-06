package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoEntity;
import org.springframework.web.bind.annotation.*;

/**
 * description：DemoEntityController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 15:18
 */
@RestController
@RequestMapping("/demoEntity/")
public class DemoEntityController extends BaseCrudRestController<DemoEntity> {

    @PostMapping("add")
    public Object add(DemoEntity entity) throws Exception {
        return createEntity(entity);
    }

    @GetMapping("get/{id}")
    public Object get(@PathVariable("id") Long id) throws Exception {
        return getEntity(id);
    }
}
