package com.linsir.core.mybatis.playground.data;


import com.linsir.core.mybatis.data.access.UserOrgDataAccessScopeManager;
import com.linsir.core.mybatis.playground.modules.example.entity.DataScope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * description：LinsirDataAccessScopeManager
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/16 23:22
 */
@Component
public class LinsirDataAccessScopeManager extends UserOrgDataAccessScopeManager {
    @Override
    public List<Class<?>> getEntityClasses() {
        List<Class<?>> entityClasses = new ArrayList<Class<?>>();
        /*try {
            entityClasses.add(Class.forName("DataScope"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        entityClasses.add(DataScope.class);
        return entityClasses;
    }
}
