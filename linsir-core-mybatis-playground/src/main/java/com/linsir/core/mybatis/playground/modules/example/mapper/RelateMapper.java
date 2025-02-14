package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.Relate;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：RelateMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:41
 */
@Mapper
public interface RelateMapper extends BaseCrudMapper<Relate> {
}
