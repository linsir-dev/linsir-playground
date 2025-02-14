package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DepartmentMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 14:13
 */
@Mapper
public interface DepartmentMapper extends BaseCrudMapper<Department> {
}
