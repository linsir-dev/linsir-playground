package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.data.annotation.DataMask;
import com.linsir.core.mybatis.data.protect.DefaultEncryptTypeHandler;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * description：Mask
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/17 2:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("mask")
public class Mask extends BaseEntity<Long> {

    @Serial
    private static final long serialVersionUID = 1L;


    private String name;

    @DataMask
    private String phone;

    @TableField(typeHandler = DefaultEncryptTypeHandler.class)
    private String password;
}
