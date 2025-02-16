package com.linsir.core.mybatis.playground.modules.example.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.linsir.core.mybatis.data.access.DataAccessCheckpoint;
import com.linsir.core.mybatis.entity.BaseModel;
import lombok.Data;

/**
 * description：DataScop
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/16 23:45
 */
@Data
@TableName("data_scope")
public class DataScope extends BaseModel {

    private String name;

    private String orgId;

    @DataAccessCheckpoint
    private String userId;

}
