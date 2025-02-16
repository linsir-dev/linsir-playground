package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.Mask;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.*;

/**
 * description：MaskController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/17 2:46
 */
@RestController
@RequestMapping("/mask/")
public class MaskController extends BaseCrudRestController<Mask> {


    @PostMapping("add")
    public R add(Mask mask)
    {
        return exec(()->{
            return JsonResult.OK(createEntity(mask));
        });
    }

    @GetMapping("get/{id}")
    public R get(@PathVariable("id") Long id)
    {
        return exec(()->{
            return JsonResult.OK(getEntity(id));
        });
    }

}
