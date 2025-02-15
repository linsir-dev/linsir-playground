package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.Task;
import com.linsir.core.mybatis.playground.modules.example.mapper.TaskMapper;
import com.linsir.core.mybatis.playground.modules.example.service.TaskService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：TaskServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:09
 */
@Service
public class TaskServiceImpl extends BaseServiceImpl<TaskMapper, Task> implements TaskService {
}
