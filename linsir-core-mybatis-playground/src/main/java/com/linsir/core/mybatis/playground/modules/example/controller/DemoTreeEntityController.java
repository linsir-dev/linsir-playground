package com.linsir.core.mybatis.playground.modules.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.core.constant.TypeConstant;
import com.linsir.core.mybatis.binding.Binder;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoTreeEntity;
import com.linsir.core.mybatis.playground.modules.example.vo.DemoTreeEntityVo;
import com.linsir.core.mybatis.util.BeanUtils;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import com.linsir.core.utils.BeanUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description：DemoTreeEntityController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 1:52
 */
@RestController
@RequestMapping("/demoTreeEntity/")
public class DemoTreeEntityController extends BaseCrudRestController<DemoTreeEntity> {

    @PostMapping("add")
    public R add(DemoTreeEntity demoTreeEntity)
    {
        return  exec(TypeConstant.LOG_TYPE_2,()->{
            return JsonResult.OK( createEntity(demoTreeEntity));
        });
    }

    @GetMapping("getTree")
    public R getTree()
    {
        return exec(TypeConstant.LOG_TYPE_2,()->{
            QueryWrapper<DemoTreeEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByDesc("id");
            List<DemoTreeEntity> demoTreeEntityList = getService().getEntityList(queryWrapper);
            List<DemoTreeEntityVo> treeVO = Binder.convertAndBindRelations(demoTreeEntityList,DemoTreeEntityVo.class);
            List<DemoTreeEntityVo> tree = BeanUtils.buildTree(treeVO);
            return JsonResult.OK(tree);
        });
    }
}
