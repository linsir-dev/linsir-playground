package com.linsir.core.mybatis.playground.modules.example.vo;


import com.linsir.core.mybatis.binding.annotation.*;
import com.linsir.core.mybatis.playground.modules.example.entity.Department;
import com.linsir.core.mybatis.playground.modules.example.entity.KeyExt;
import com.linsir.core.mybatis.playground.modules.example.entity.KeyModel;
import com.linsir.core.mybatis.playground.modules.example.entity.Relate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * description：KeyModelVO
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 13:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class KeyModelVO extends KeyModel {

    @BindDict(type = "auth",field = "dicId")
    private String dicName;

    // 这里的字段，对应国际化表中的code
    @BindI18n("i18nId")
    private String i18nName;

    //绑定实体 主表1-1直接关联从表，绑定从表Entity，注解示例如下：
    @BindEntity(entity = Department.class,condition = "this.department_id=id")
    private Department department;

    //主表1-1通过中间表间接关联从表，绑定从表Entity，注解示例如下(condition不同)：
    //deepBind 是否深度绑定，默认false。当绑定Entity对象为VO(类定义中还有Bind注解)，开启deepBind=true，可以实现对被绑定VO的注解的再次绑定。
    @BindEntity(entity = Relate.class,condition = "this.id = key_ext.key_id AND key_ext.ext_id = relate.id")
    private Relate relate;

    /*
    *附加参数
            orderBy 对绑定结果集合的排序标识，用法同列表页查询的orderBy排序，具体格式为'列名:排序方式,列名:排序方式'，示例如下：
            orderBy="sort_id" //按sort_id升序（默认）
            orderBy="sort_id:ASC" //按sort_id升序
            orderBy="sort_id:DESC" //按sort_id降序
            orderBy="type:ASC,id:DESC" //先按type升序，type相同按id降序
            splitBy 分隔符，用于拆解拼接存储的多个id值
    * */
    // 当前表task_ids字段中以分隔符拼接存储了Task对象的id，如：10001,10002,10003
    @BindEntityList(entity = KeyExt.class,condition = "this.id = key_ext.key_id")
    private List<KeyExt> keyExtList;


    //主表1-1直接关联从表，绑定从表字段值，注解示例如下：
    @BindField(entity = Department.class,field = "name",condition = "this.department_id=id")
    private String departmentName;

    // 关联其他表(main_table_id为Task中存储当前对象id的字段)
    // 当前表task_ids字段中以分隔符拼接存储了Task对象的id，如：10001,10002,10003
    //@BindFieldList(entity = Task.class, field="task_title", condition="this.task_ids=id", splitBy=",")
    //private List<String> taskTitleList;
    @BindFieldList(entity = KeyExt.class,field = "type", condition = "this.id = key_ext.key_id")
    private List<String> keyTypes;

    //主表对应的列表页面需要显示从表子项的汇总计数，注解示例如下：
    @BindCount(entity = KeyExt.class, condition="this.id = key_ext.key_id")
    private Integer keyCount;
}
