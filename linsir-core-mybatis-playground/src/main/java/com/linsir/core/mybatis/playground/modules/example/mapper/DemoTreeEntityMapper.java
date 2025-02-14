package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoTreeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DemoTreeEntityMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 1:34
 */
@Mapper
public interface DemoTreeEntityMapper extends BaseCrudMapper<DemoTreeEntity> {
}
