package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoAbs;
import org.springframework.web.bind.annotation.*;

/**
 * description：DemoAbsController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 3:27
 */
@RestController
@RequestMapping("/demoAbs/")
public class DemoAbsController extends BaseCrudRestController<DemoAbs> {

    @PostMapping("add")
    public Object add(DemoAbs demoAbs) throws Exception {
        return createEntity(demoAbs);
    }


    /**
     * 继承  AbstractEntity   没有自动填充字段   删除的时候，是物理删除
     * @param id
     * @return
     * @throws Exception
     */
    @DeleteMapping("del/{id}")
    public Object delete(@PathVariable("id") Long id) throws Exception {
        return deleteEntity(id);
    }
}
