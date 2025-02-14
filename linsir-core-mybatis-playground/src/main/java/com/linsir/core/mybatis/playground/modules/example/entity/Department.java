package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;

/**
 * description：Department
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 14:09
 */
@Data
@TableName("department")
public class Department extends BaseEntity<Long> {

    private String name;

}
