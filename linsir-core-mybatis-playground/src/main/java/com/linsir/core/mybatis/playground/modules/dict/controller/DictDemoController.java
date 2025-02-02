package com.linsir.core.mybatis.playground.modules.dict.controller;


import com.linsir.core.code.ResultCode;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.dict.entiy.DictDemo;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.*;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 18:13
 */
@RestController
@RequestMapping("/dict/")
public class DictDemoController extends BaseCrudRestController<DictDemo> {

    /**
     * 默认
     * @return
     */
    @GetMapping("")
    public R index()
    {
       return exec(()->{
            return new JsonResult(ResultCode.SUCCESS);
        });
    }

    /**
     *
     * @param dictDemo
     * @return
     */
    @PostMapping("add")
    public R add(DictDemo dictDemo){
       return exec(()->{
          return createEntity(dictDemo);
       });
    }

    /**
     * get
     * @param id
     * @return
     */
    @GetMapping("get/{id}")
    public R get(@PathVariable("id") Long id)
    {
        return exec(()->{
            return JsonResult.OK(getEntity(id));
        });
    }
}