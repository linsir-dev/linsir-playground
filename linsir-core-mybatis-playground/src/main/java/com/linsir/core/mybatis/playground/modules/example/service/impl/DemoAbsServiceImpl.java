package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.DemoAbs;
import com.linsir.core.mybatis.playground.modules.example.mapper.DemoAbsMapper;
import com.linsir.core.mybatis.playground.modules.example.service.DemoAbsService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：DemoAbsServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 3:25
 */
@Service
public class DemoAbsServiceImpl extends BaseServiceImpl<DemoAbsMapper, DemoAbs> implements DemoAbsService {
}
