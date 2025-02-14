package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseController;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.KeyModel;
import com.linsir.core.mybatis.playground.modules.example.vo.KeyModelVO;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.*;

/**
 * description：KeyModelController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:48
 */
@RestController
@RequestMapping("/keyModel/")
public class KeyModelController extends BaseCrudRestController<KeyModel> {

    /**
     *
     * @param keyModel
     * @return
     */
    @PostMapping("add")
    public R add(KeyModel keyModel){
       return exec(()->{
           return JsonResult.OK(createEntity(keyModel));
        });
    }

    /**
     * 字典 和 国际化 绑定
     * @param id
     * @return
     */
    @GetMapping("getVo/{id}")
    public R get(@PathVariable("id") Long id)
    {
        return exec(()->{
            return JsonResult.OK(getViewObject(id, KeyModelVO.class));
        });
    }
}
