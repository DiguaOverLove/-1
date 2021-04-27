package com.neu.controller;

import com.neu.biz.DeptBiz;
import com.neu.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptBiz deptBiz;

    @GetMapping(value = "/findAll")
    public List<Dept> findAll(){
        return deptBiz.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Dept findById(@PathVariable("id")int id){
        return deptBiz.findById(id);
    }
}
