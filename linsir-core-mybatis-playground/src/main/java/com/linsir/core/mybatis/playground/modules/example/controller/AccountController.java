package com.linsir.core.mybatis.playground.modules.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.dto.AccountDto;
import com.linsir.core.mybatis.playground.modules.example.entity.Account;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：AccountController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 17:08
 */
@RestController
@RequestMapping("/account/")
public class AccountController extends BaseCrudRestController<Account> {

    @PostMapping("add")
    public R add(Account account) {
        return exec(()->{
           return JsonResult.OK(createEntity(account));
        });
    }


    @PostMapping("list")
    public R list(AccountDto accountDto) {
        return exec(()->{
            QueryWrapper<AccountDto> queryWrapper = buildQueryWrapperByDTO(accountDto);
            return JsonResult.OK(getEntityList(queryWrapper));
        });
    }
}
