package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.DictDemo;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DictDemoMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/3 19:32
 */
@Mapper
public interface DictDemoMapper extends BaseCrudMapper<DictDemo> {
}
