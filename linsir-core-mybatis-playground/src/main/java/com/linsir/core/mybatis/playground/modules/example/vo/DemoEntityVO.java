package com.linsir.core.mybatis.playground.modules.example.vo;


import com.linsir.core.mybatis.playground.modules.example.entity.DemoEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description：DemoEntityVO
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/11 23:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DemoEntityVO extends DemoEntity {
    private String demoName;
}
