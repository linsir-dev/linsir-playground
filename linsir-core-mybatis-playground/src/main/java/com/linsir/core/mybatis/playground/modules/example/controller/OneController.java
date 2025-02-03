package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.One;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * description：OneCotroller
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/3 16:38
 */
@Slf4j
@RestController
@RequestMapping("/one/")
public class OneController extends BaseCrudRestController<One> {

    /**
     * 增加
     * @param one
     * @return
     */
    @PostMapping("add")
    public R add(One one) {
        return exec(()-> createEntity(one));
    }

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    @DeleteMapping("del/{id}")
    public R del(@PathVariable("id") Long id) {
        return exec(()-> deleteEntity(id));
    }

    /**
     * 修改
     * @param one
     * @return
     */
    @PostMapping("update")
    public R update(One one) {
        return exec(()->updateEntity(one.getId(),one));
    }

    /**
     * 查找 默认租户000000
     * @param id
     * @return
     */
    @GetMapping("get/{id}")
    public R get(@PathVariable("id") Long id)
    {
        return exec(()-> JsonResult.OK( getEntity(id)));
    }

    @Override
    protected String beforeCreate(One entityOrDto) throws Exception {
        log.info("beforeCreate:{}.可以验证",entityOrDto);
        return null;
    }
}
