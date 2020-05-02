package com.hc.controller;

import com.hc.bean.Emp;
import com.hc.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/controller/emp")
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    @RequestMapping("/list")
    public Emp list(@RequestParam(value = "empno",required = true)Integer empno){
        Emp emp = empMapper.selectByPrimaryKey(empno);
        System.out.println("emp "+emp);
        return  emp;
    }

    //利用全局类型转换器，将客户端传递过来的日期形式的字符串转换为Date类型
    @RequestMapping("/fun")
    public void fun(Date date){
        System.out.println("Date: "+date);
    }
}
