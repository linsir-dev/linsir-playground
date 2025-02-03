package com.linsir.core.mybatis.playground.modules.example.vo;


import com.linsir.core.mybatis.binding.annotation.BindDict;
import com.linsir.core.mybatis.playground.modules.example.entity.DictDemo;
import lombok.Data;

/**
 * description：demo
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/2 23:53
 */
@Data
public class DictDemoVo extends DictDemo {

    @BindDict(type = "AUTH_TYPE",field = "dict_id")
    private String dictValue;
}
