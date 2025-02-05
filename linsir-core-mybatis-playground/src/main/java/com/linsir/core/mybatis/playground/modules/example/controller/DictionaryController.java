package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseController;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.entity.Dictionary;
import com.linsir.core.mybatis.service.DictionaryService;
import com.linsir.core.mybatis.vo.DictionaryVO;
import com.linsir.core.mybatis.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：DictionaryController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/5 20:39
 */
@RestController
@RequestMapping("/dict/")
public class DictionaryController extends BaseCrudRestController<Dictionary> {

    @Autowired
    private DictionaryService dictionaryService;


    @PostMapping("add")
    public JsonResult<Boolean> add(DictionaryVO dictionaryVO) {
       return JsonResult.OK(dictionaryService.createDictAndChildren(dictionaryVO));
    }
}
