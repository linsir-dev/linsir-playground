package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.entity.BaseTreeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：DemoTreeEntity
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 1:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("demo_tree_entity")
public class DemoTreeEntity extends BaseTreeEntity<Long> {

    private String name;
}
