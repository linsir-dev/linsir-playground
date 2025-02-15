package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：Task
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 12:01
 */
@TableName("task")
@Data
@EqualsAndHashCode(callSuper = true)
public class Task extends BaseEntity<Long> {

    private String name;

    private Long workId;
}
