package com.linsir.core.mybatis.playground.modules.example.service.impl;


import com.linsir.core.mybatis.playground.modules.example.entity.Account;
import com.linsir.core.mybatis.playground.modules.example.mapper.AccountMapper;
import com.linsir.core.mybatis.playground.modules.example.service.AccountService;
import com.linsir.core.mybatis.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * description：AccountServiceImpl
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 17:04
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountMapper, Account> implements AccountService {
}
