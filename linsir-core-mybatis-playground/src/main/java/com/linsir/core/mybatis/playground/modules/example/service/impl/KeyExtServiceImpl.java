package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.KeyExt;
import com.linsir.core.mybatis.playground.modules.example.mapper.KeyExtMapper;
import com.linsir.core.mybatis.playground.modules.example.service.KeyExtService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：KeyExtServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:44
 */
@Service
public class KeyExtServiceImpl extends BaseServiceImpl<KeyExtMapper, KeyExt> implements KeyExtService {
}
