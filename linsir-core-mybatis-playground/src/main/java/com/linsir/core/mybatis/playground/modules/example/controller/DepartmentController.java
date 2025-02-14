package com.linsir.core.mybatis.playground.modules.example.controller;


import com.linsir.core.mybatis.controller.BaseController;
import com.linsir.core.mybatis.controller.BaseCrudRestController;
import com.linsir.core.mybatis.playground.modules.example.entity.Department;
import com.linsir.core.mybatis.vo.JsonResult;
import com.linsir.core.results.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：DepartmentController
 * author     ：linsir
 * version    ： v1.2.0
 * date       ：2025/2/14 14:15
 */
@RestController
@RequestMapping("/department/")
public class DepartmentController extends BaseCrudRestController<Department> {

    @PostMapping("add")
    public R add(Department department)
    {
        return exec(()->{
            return JsonResult.OK(createEntity(department));
        });
    }
}
