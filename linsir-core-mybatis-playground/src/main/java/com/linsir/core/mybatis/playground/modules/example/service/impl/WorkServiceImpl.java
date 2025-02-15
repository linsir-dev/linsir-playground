package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.Work;
import com.linsir.core.mybatis.playground.modules.example.mapper.WorkMapper;
import com.linsir.core.mybatis.playground.modules.example.service.WorkService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：WorkServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:06
 */
@Service
public class WorkServiceImpl extends BaseServiceImpl<WorkMapper, Work> implements WorkService {
}
