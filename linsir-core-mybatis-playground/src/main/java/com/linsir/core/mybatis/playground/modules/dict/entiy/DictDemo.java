package com.linsir.core.mybatis.playground.modules.dict.entiy;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：字典 demo
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/1 17:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("dict_demo")
public class DictDemo extends BaseEntity<Long> {

    private String name;

    private int dictId;

}
