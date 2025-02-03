package com.linsir.core.mybatis.playground.modules.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.One;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：mapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/3 16:13
 */
@Mapper
public interface OneMapper extends BaseCrudMapper<One> {
}
