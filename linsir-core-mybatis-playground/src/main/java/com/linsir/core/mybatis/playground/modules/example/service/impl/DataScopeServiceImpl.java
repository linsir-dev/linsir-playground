package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.DataScope;
import com.linsir.core.mybatis.playground.modules.example.mapper.DataScopeMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DataScopeService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：DataScopeServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/16 23:49
 */
@Service
public class DataScopeServiceImpl extends BaseServiceImpl<DataScopeMapper, DataScope> implements DataScopeService {
}
