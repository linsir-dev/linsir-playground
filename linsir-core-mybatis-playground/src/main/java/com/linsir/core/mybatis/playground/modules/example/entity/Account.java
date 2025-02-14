package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：Account
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 16:31
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("account")
public class Account extends BaseEntity<Long> {

    private Long gender;

    private String realName;
}
