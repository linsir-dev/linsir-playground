package com.linsir.core.mybatis.playground.modules.example.mapper;


import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.mapper.BaseCrudMapper;
import com.linsir.core.mybatis.playground.modules.example.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * description：AccountMapper
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 17:00
 */
@Mapper
public interface AccountMapper extends BaseCrudMapper<Account> {
}
