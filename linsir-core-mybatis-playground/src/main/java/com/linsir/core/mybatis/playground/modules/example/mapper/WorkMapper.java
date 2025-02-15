package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.Work;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：WorkMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:02
 */
@Mapper
public interface WorkMapper extends BaseCrudMapper<Work> {
}
