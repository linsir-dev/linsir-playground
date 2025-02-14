package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：KeyExt
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("key_ext")
public class KeyExt extends BaseEntity<Long> {

    private Long keyId;

    private String type;

    private Long extId;
}
