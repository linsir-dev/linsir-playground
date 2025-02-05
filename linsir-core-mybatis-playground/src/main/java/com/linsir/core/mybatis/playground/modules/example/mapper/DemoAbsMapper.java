package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoAbs;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DemoAbsMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 1:45
 */
@Mapper
public interface DemoAbsMapper extends BaseCrudMapper<DemoAbs> {
}
