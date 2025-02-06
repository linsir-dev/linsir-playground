package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.DemoModel;
import com.linsir.core.mybatis.playground.modules.example.mapper.DemoModelMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DemoModelService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：DemoModelServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 16:58
 */
@Service
public class DemoModelServiceImpl extends BaseServiceImpl<DemoModelMapper, DemoModel> implements DemoModelService {
}
