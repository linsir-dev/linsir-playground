package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DemoEntity
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 15:14
 */
@Mapper
public interface DemoEntityMapper extends BaseCrudMapper<DemoEntity> {
}
