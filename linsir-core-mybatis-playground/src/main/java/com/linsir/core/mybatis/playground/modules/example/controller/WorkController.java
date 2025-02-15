package com.linsir.core.mybatis.playground.modules.example.controller;


import com.google.common.collect.Lists;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.Task;
import com.linsir.core.mybatis.playground.modules.example.entity.Work;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * description：WorkController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:10
 */
@RestController
@RequestMapping("/work/")
public class WorkController extends BaseCrudRestController<Work> {

    @PostMapping("add")
    public R add(Work work) {
        return exec(()->{
           return JsonResult.OK(createEntity(work));
        });
    }

    /**
     * 创建主实体及关联的从实体对象集合 （用于1对多的主子表数据一起提交保存）
     * boolean updateEntityAndRelatedEntities(T entity, List<RE> relatedEntities, ISetter<RE, R> relatedEntitySetter);
     * boolean deleteEntityAndRelatedEntities(T entity, List<RE> relatedEntities, ISetter<RE, R> relatedEntitySetter);
     * @param work
     * @return
     */
    @PostMapping("addAndRelate")
    public R addAndRelate(Work work)
    {
        return exec(()->{
            Task task = new Task();
            task.setName("task1");
            Task task2 = new Task();
            task2.setName("task2");
            List<Task> taskList = new ArrayList<>();
            taskList.add(task);
            taskList.add(task2);
            return JsonResult.OK(getService().createEntityAndRelatedEntities(work,taskList,Task::setWorkId));
        });
    }
}
