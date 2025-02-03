package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description： 实体类
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/3 15:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("one")
public class One extends BaseEntity<Long> {

    private String name;

    private Integer age;

    private String address;

}
