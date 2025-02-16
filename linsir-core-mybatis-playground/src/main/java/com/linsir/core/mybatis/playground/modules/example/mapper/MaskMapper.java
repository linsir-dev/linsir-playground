package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.Mask;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：MaskMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/17 2:44
 */
@Mapper
public interface MaskMapper extends BaseCrudMapper<Mask> {
}
