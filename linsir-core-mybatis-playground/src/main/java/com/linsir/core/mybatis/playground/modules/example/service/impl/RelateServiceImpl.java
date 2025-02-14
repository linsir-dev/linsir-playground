package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.Relate;
import com.linsir.core.mybatis.playground.modules.example.mapper.RelateMapper;
import com.linsir.core.mybatis.playground.modules.example.service.RelateService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：RelateServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:47
 */
@Service
public class RelateServiceImpl extends BaseServiceImpl<RelateMapper, Relate> implements RelateService {
}
