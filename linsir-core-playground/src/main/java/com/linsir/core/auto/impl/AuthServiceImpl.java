package com.linsir.core.auto.impl;

import com.linsir.core.auto.IAuthService;
import com.linsir.core.auto.service.AutoService;

/**
 * @ClassName : AuthServiceImpl
 * @Description :
 * @Author : Linsir
 * @Date: 2023-12-26 09:37
 */

@AutoService(IAuthService.class)
public class AuthServiceImpl implements IAuthService {
    @Override
    public void say() {
        System.out.println("xxxxx");
    }
}
