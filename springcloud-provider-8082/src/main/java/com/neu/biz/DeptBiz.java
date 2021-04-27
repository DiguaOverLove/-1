package com.neu.biz;

import com.neu.entity.Dept;

import java.util.List;

public interface DeptBiz {
    public List<Dept> findAll();
    public Dept findById(int id);
}
