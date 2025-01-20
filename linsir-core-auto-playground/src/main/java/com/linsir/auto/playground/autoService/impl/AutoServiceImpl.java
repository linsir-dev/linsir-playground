package com.linsir.auto.playground.autoService.impl;


import com.linsir.auto.playground.autoService.IAutoService;
import com.linsir.core.auto.service.AutoService;

/**
 * description：实现
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/1/20 15:02
 */
@AutoService(IAutoService.class)
public class AutoServiceImpl implements IAutoService {

    @Override
    public void sayHello() {
        System.out.println("sayHello-------------------"+"Hello World");
    }
}
