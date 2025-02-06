package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import com.linsir.core.mybatis.util.S;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：DemoEntity
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 15:10
 */
@EqualsAndHashCode(callSuper = true)
@TableName("demo_entity")
@Data
public class DemoEntity extends BaseEntity<Long> {
    private String name;
}
