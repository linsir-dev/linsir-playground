package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.DemoTreeEntity;
import com.linsir.core.mybatis.playground.modules.example.mapper.DemoTreeEntityMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DemoTreeEntityService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：DemoTreeEntityServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 1:37
 */
@Service
public class DemoTreeEntityServiceImpl extends BaseServiceImpl<DemoTreeEntityMapper, DemoTreeEntity> implements DemoTreeEntityService {
}
