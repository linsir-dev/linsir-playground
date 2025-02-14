package com.linsir.core.mybatis.playground.modules.example.vo;


import com.linsir.core.mybatis.playground.modules.example.entity.DemoTreeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * description：DemoTreeEntityVo
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 3:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DemoTreeEntityVo extends DemoTreeEntity {

    private List<DemoTreeEntityVo> children;
}
