package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoModel;
import org.springframework.web.bind.annotation.*;

/**
 * description：DemoModelController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 16:59
 */
@RestController
@RequestMapping("/demoModel/")
public class DemoModelController extends BaseCrudRestController<DemoModel> {

    @PostMapping("add")
    public Object add(DemoModel model) throws Exception {
        return createEntity(model);
    }

    @GetMapping("get/{id}")
    public Object get(@PathVariable("id") Long id) throws Exception {
        return getEntity(id);
    }
}
