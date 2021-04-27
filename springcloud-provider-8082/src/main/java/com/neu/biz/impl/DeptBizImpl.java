package com.neu.biz.impl;

import com.neu.biz.DeptBiz;
import com.neu.entity.Dept;
import com.neu.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptBiz")
public class DeptBizImpl implements DeptBiz {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public Dept findById(int id) {
        return deptMapper.findById(id);
    }
}
