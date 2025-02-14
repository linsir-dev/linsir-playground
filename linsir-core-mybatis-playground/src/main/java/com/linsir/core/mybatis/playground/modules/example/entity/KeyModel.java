package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：KeyModel
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 12:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("key_model")
public class KeyModel extends BaseEntity<Long> {

    private String name;


    private String dicId;


    private String i18nId;


    private Long departmentId;

}
