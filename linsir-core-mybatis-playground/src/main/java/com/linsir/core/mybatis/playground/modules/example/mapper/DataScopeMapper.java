package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.DataScope;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：DataScopeMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/16 23:48
 */
@Mapper
public interface DataScopeMapper extends BaseCrudMapper<DataScope> {

}
