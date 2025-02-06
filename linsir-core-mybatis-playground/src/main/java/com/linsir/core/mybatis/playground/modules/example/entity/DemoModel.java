package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：DemoModel
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 16:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("demo_model")
public class DemoModel extends BaseModel {

    private String name;
}
