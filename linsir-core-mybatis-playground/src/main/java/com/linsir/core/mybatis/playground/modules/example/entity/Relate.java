package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：Relate
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("relate")
public class Relate extends BaseEntity<Long> {
    private String name;
}
