package com.linsir.core.mybatis.playground.modules.dict.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.dict.entiy.DictDemo;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：mapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 17:39
 */
@Mapper
public interface DictDemoMapper extends BaseCrudMapper<DictDemo> {
}
