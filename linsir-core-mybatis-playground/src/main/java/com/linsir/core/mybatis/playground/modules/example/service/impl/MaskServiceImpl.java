package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.Mask;
import com.linsir.core.mybatis.playground.modules.example.mapper.MaskMapper;
import com.linsir.core.mybatis.playground.modules.example.service.MaskService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：MaskServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/17 2:45
 */
@Service
public class MaskServiceImpl extends BaseServiceImpl<MaskMapper, Mask> implements MaskService {
}
