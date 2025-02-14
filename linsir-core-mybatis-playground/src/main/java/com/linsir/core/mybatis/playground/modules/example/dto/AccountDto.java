package com.linsir.core.mybatis.playground.modules.example.dto;


import com.linsir.core.mybatis.binding.query.BindQuery;
import com.linsir.core.mybatis.binding.query.Comparison;
import com.linsir.core.mybatis.playground.modules.example.entity.Account;
import com.linsir.core.mybatis.playground.modules.example.entity.Department;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：AccountDto
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 16:33
 */
@Data
public class AccountDto  {
    // 无@BindQuery注解默认会映射为=条件；主表的相等条件无需加注解
    //private Long gender;

    //@BindQuery(comparison = Comparison.LIKE)
    //private String realName;

    @BindQuery(comparison = Comparison.STARTSWITH, entity= Department.class, field="name", condition="this.department_id=id")
    private String departmentName;

    // 多注解，多个条件 or 连接
    //@BindQuery(comparison = Comparison.LIKE, field="realname")
   // @BindQuery(comparison = Comparison.STARTSWITH, entity=Organization.class, field="name", condition="this.org_id=id")
   // private String name;
}
