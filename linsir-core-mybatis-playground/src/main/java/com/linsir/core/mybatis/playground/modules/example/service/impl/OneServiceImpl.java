package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.One;
import com.linsir.core.mybatis.playground.modules.example.mapper.OneMapper;
import com.linsir.core.mybatis.playground.modules.example.service.OneService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：OneServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/3 16:15
 */
@Service
public class OneServiceImpl extends BaseServiceImpl<OneMapper, One> implements OneService {
}
