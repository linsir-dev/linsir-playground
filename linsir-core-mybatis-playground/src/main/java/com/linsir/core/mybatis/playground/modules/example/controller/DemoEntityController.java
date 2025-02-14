package com.linsir.core.mybatis.playground.modules.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linsir.core.constant.TypeConstant;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.DemoEntity;
import com.linsir.core.mybatis.playground.modules.example.vo.DemoEntityVO;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.mybatis.vo.Pagination;
import com.linsir.core.results.R;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * description：DemoEntityController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/6 15:18
 */
@Slf4j
@RestController
@RequestMapping("/demoEntity/")
public class DemoEntityController extends BaseCrudRestController<DemoEntity> {


    /*BaseCrudRestController  一些方法*/
    /**
     *
     * @param entity
     * @return
     * @throws Exception
     */
    @PostMapping("add")
    public Object add(@Valid DemoEntity entity) throws Exception {
        return createEntity(entity);
    }

    /**
     * 插入前
     * @param entityOrDto
     * @throws Exception
     */
    @Override
    protected void beforeCreate(DemoEntity entityOrDto) throws Exception {
        log.info("beforeCreate entityOrDto : {}", entityOrDto);
        super.beforeCreate(entityOrDto);
    }

    @Override
    protected void afterCreated(DemoEntity entityOrDto) throws Exception {
        log.info("afterCreate entityOrDto : {}", entityOrDto);
        super.afterCreated(entityOrDto);
    }

    /**
     * 物理删除
     * @param id
     * @return
     * @throws Exception
     */
    @DeleteMapping("del/{id}")
    public R delete(@PathVariable("id") Long id) throws Exception {
        return exec(()->{
            return deleteEntity(id);
        });
    }

    @Override
    protected void beforeDelete(Serializable id) throws Exception {
        log.info("beforeDelete id : {}", id);
        super.beforeDelete(id);
    }

    @Override
    protected void afterDeleted(Serializable id) throws Exception {
        log.info("afterDeleted id : {}", id);
        super.afterDeleted(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @PostMapping("batchDeleteEntities")
    public R batchDeleteEntities(String ids)
    {
        List<String> idList = Arrays.asList(ids.split(","));
        return exec(()->{
            return batchDeleteEntities(idList);
        });
    }

    @Override
    protected void beforeBatchDelete(Collection<? extends Serializable> ids) throws Exception {
        log.info("beforeBatchDelete ids : {}", ids);
        super.beforeBatchDelete(ids);
    }

    protected void afterBatchDelete(DemoEntity demoEntity) throws Exception {
        log.info("afterBatchDelete id : {}",demoEntity.getId());
        super.afterCreated(demoEntity);
    }

    /**
     * 更新
     * @param entity
     * @return
     */
    @PostMapping("update")
    public R update(@Valid DemoEntity entity)  {
        return   exec(()->{
            return updateEntity(entity.getId(), entity);
        });
    }

    @Override
    protected void beforeUpdate(DemoEntity entityOrDto) throws Exception {
        log.info("beforeUpdate entityOrDto : {}", entityOrDto);
        super.beforeUpdate(entityOrDto);
    }

    @Override
    protected void afterUpdated(DemoEntity entityOrDto) throws Exception {
        log.info("afterUpdate entityOrDto : {}", entityOrDto);
        super.afterUpdated(entityOrDto);
    }

    /**
     * 获取vo对象
     * @param id
     * @return
     * @throws Exception
     */
    @GetMapping("getViewObject/{id}")
    public JsonResult<DemoEntityVO> getViewObject(@PathVariable("id") Long id) throws Exception {
        return getViewObject(id,DemoEntityVO.class);
    }

    /**
     * getEntity接口可以通过一个主键值得到数据库中的对应记录转换为Entity，如：
     * @param id
     * @return
     * @throws Exception
     */
    @GetMapping("get/{id}")
    public Object get(@PathVariable("id") Long id) throws Exception {
        return getEntity(id);
    }


    /**
     *
     * @param pageSize
     * @param index
     * @return
     */
    @PostMapping("getViewObjectList")
    public R getViewObjectList(int pageSize,int index)
    {
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setPageIndex(index);
        // 更具DemoEntity 绑定字段进行查询
        DemoEntity demoEntity = new DemoEntity();
        return exec(()->{
            return getViewObjectList(demoEntity,pagination,DemoEntityVO.class);
        });
    }

    /**
     *
     * @return
     */
    @GetMapping("getEntityList")
    public R getEntityList()
    {
        return exec(()->{
            QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByAsc("id");
            return getEntityList(queryWrapper);
        });
    }


    /**
     *
     * @param pageSize
     * @param index
     * @return
     */
    @PostMapping("getEntityListWithPaging")
    public R getEntityListWithPaging(int pageSize,int index)
    {
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setPageIndex(index);
        QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("id");
        return exec(()->{
          return getEntityListWithPaging(queryWrapper,pagination);
        });
    }


    /*BaseService  一些方法*/
    /**
     * getEntityListCount - 查询符合条件的记录数量
     * @param name
     * @return
     * @throws Exception
     */
    @PostMapping("getSingleEntity")
    public DemoEntity getSingleEntity(String name) throws Exception {
        QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        return getService().getSingleEntity(queryWrapper);
    }

    /**
     *getEntityListCount - 查询符合条件的记录数量
     * @return
     * @throws Exception
     */
    @GetMapping("getEntityListCount")
    public Long getEntityListCount() throws Exception {
        LambdaQueryWrapper<DemoEntity> lambdaQueryWrapper = new LambdaQueryWrapper<DemoEntity>()
                .eq(DemoEntity::getName,"linsir");
        QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("id");
       return getService().getEntityListCount(queryWrapper);
    }


    /**
     *
     * @return
     */
    @GetMapping("getEntityListLimit")
    public R getEntityListLimit()
    {
        return exec(()->{
            LambdaQueryWrapper<DemoEntity> lambdaQueryWrapper = new LambdaQueryWrapper<DemoEntity>()
                    .eq(DemoEntity::getName,"linsir");
          return JsonResult.OK(getService().getEntityListLimit(lambdaQueryWrapper,10));
        });
    }

    /**
     *
     * @param ids
     * @return 根据指定ids返回对应的实体列表
     */
    @PostMapping("getEntityListByIds")
    public R getEntityListByIds(String ids)
    {
       return exec(TypeConstant.LOG_TYPE_2,()->{
            List idList = Arrays.asList(ids.split(","));
            return JsonResult.OK(getService().getEntityListByIds(idList));
        });
    }

    /**
     * 获取指定ids的实体列表
     * @param id
     * @return
     */
    @GetMapping("getValueOfField/{id}")
    public R getValueOfField(@PathVariable("id")Long id)
    {
        return exec(TypeConstant.LOG_TYPE_2,()->{
            QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByAsc("name");
            return JsonResult.OK(getService().getValueOfField(id,DemoEntity::getId));
        });
    }

    /**
     *  获取指定字段的值
     * @return
     */
    @GetMapping("getValuesOfField")
    public R getValuesOfField()
    {
        return exec(TypeConstant.LOG_TYPE_2,()->{
            QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByAsc("name");
            List<String> getters = getService().getValuesOfField("name","linsir",DemoEntity::getName);
            log.info("getValuesOfField : {}", getters);
            return JsonResult.OK(getService().getValuesOfField(queryWrapper,DemoEntity::getName));
        });
    }

    /**
     * 查询符合条件的Map结构数据集合
     * @return
     */
    @GetMapping("getMapList")
    public R getMapList()
    {
        return exec(TypeConstant.LOG_TYPE_2,()->{
            QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByAsc("name");
           return JsonResult.OK(getService().getMapList(queryWrapper));
        });
    }

    /**
     * 获取符合条件的键值对集合
     * @return
     */
    @GetMapping("getLabelValueList")
    public R getLabelValueList()
    {
        return exec(TypeConstant.LOG_TYPE_2,()->{
            QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();
            //调用错误: getLabelValueList必须用select依次指定返回的 label,value(,ext)键值字段，
            queryWrapper.lambda().select(DemoEntity::getId,DemoEntity::getName);
            return JsonResult.OK(getService().getLabelValueList(queryWrapper));
        });
    }

    /**返回id-Entity对象的映射map
     * 返回id-name的映射map
     * @param ids
     * @return
     */
    @PostMapping("getId2NameMap")
    public R getId2NameMap(String ids)
    {
       return exec(TypeConstant.LOG_TYPE_2,()->{
           List<String> idList = Arrays.asList(ids.split(","));
           List<Long> longList = new ArrayList<>();
           idList.forEach(id->{
               longList.add(Long.parseLong(id));
           });
           return JsonResult.OK(getService().getId2NameMap(longList,DemoEntity::getName));
       });
    }

    /**
     *
     * @return
     */
    @GetMapping("exists")
    public R exists()
    {
        return exec(TypeConstant.LOG_TYPE_2,()->{
            return JsonResult.OK(getService().exists(DemoEntity::getName,"linsir"));
        });
    }

}
