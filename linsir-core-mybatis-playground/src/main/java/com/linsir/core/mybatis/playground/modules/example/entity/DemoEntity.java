package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import jakarta.validation.constraints.NotNull;
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

    @TableField(exist = false)
    @NotNull(message = "上级ID不能为空，如无请设为0")
    private String parentId;

    private String name;
}
