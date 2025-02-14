package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.KeyExt;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：KeyExtController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 15:11
 */
@RestController
@RequestMapping("/keyExt/")
public class KeyExtController extends BaseCrudRestController<KeyExt> {

    @PostMapping("add")
    public R add(KeyExt keyExt)
    {
        return exec(()->{
            return JsonResult.OK(createEntity(keyExt));
        });
    }
}
