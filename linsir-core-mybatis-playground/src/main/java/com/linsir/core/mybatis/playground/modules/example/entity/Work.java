package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：Work
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:00
 */
@EqualsAndHashCode(callSuper = true)
@TableName("work")
@Data
public class Work extends BaseEntity<Long> {

    private String name;

}
