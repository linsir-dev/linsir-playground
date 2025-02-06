package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.DemoEntity;
import com.linsir.core.mybatis.playground.modules.example.mapper.DemoEntityMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DemoEntityService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：DemoEntityServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 15:16
 */
@Service
public class DemoEntityServiceImpl extends BaseServiceImpl<DemoEntityMapper, DemoEntity> implements DemoEntityService {
}
