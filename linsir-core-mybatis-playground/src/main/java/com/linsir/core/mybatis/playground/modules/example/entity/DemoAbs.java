package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description： 继承  AbstractEntity   没有自动填充字段
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 1:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("demo_abs")
public class DemoAbs extends AbstractEntity<Long> {

    private String name;

    private Integer age;

    private String address;
}
