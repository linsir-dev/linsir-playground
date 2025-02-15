package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.Task;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：TaskMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:03
 */
@Mapper
public interface TaskMapper extends BaseCrudMapper<Task> {
}
