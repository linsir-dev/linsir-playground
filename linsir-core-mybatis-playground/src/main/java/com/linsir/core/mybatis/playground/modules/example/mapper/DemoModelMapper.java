package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DemoModelMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 16:57
 */
@Mapper
public interface DemoModelMapper extends BaseCrudMapper<DemoModel> {
}
