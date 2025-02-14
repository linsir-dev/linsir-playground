package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.KeyExt;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：KeyExtMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:40
 */
@Mapper
public interface KeyExtMapper extends BaseCrudMapper<KeyExt> {
}
