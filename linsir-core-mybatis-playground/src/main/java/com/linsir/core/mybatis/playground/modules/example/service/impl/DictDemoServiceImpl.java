package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.DictDemo;
import com.linsir.core.mybatis.playground.modules.example.mapper.DictDemoMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DictDemoService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 18:00
 */
@Service
public class DictDemoServiceImpl extends BaseServiceImpl<DictDemoMapper, DictDemo> implements DictDemoService {
}
