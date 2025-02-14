package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.KeyModel;
import com.linsir.core.mybatis.playground.modules.example.mapper.KeyModelMapper;
import com.linsir.core.mybatis.playground.modules.example.service.KeyModelService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：KeyModelServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:45
 */
@Service
public class KeyModelServiceImpl extends BaseServiceImpl<KeyModelMapper, KeyModel> implements KeyModelService {
}
