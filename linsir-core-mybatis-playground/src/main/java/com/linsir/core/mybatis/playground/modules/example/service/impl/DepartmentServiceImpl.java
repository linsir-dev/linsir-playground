package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.Department;
import com.linsir.core.mybatis.playground.modules.example.mapper.DepartmentMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DepartmentService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：DepartmentServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 14:14
 */
@Service
public class DepartmentServiceImpl extends BaseServiceImpl<DepartmentMapper, Department> implements DepartmentService {
}
