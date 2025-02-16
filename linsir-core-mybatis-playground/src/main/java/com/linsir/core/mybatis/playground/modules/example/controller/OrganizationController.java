package com.linsir.core.mybatis.playground.modules.example.controller;


import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.entity.Organization;
import com.linsir.core.mybatis.service.OrganizationService;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description：OrganizationController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/15 20:45
 */
@RestController
@RequestMapping("/organization/")
public class OrganizationController extends BaseCrudRestController<Organization> {

    @Autowired
    private OrganizationService organizationService;

    /**
     * 添加公司
     * @param organization
     * @return
     */
    @PostMapping("add")
    public R add(Organization organization)
    {
        return exec(()->{
            return JsonResult.OK(createEntity(organization));
        });
    }

    @GetMapping("getChildOrgIds/{rootOrgId}")
    public R getChildOrgIds(@PathVariable("rootOrgId") String rootOrgId)
    {
        return exec(()->{
            return JsonResult.OK(organizationService.getChildOrgIds(rootOrgId));
        });

    }
}
