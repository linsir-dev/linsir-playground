package com.linsir.core.auto.playground.as.impl;


import com.linsir.core.auto.playground.as.AutoPlayService;
import com.linsir.core.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ：linsir
 * @description：TODO
 * @date ：2025/1/4 0:22
 */
@Slf4j
@AutoService(AutoPlayService.class)
public class AutoPlayServiceImpl implements AutoPlayService {
    @Override
    public void sayHello() {
      log.info("Hello World!");
    }
}
