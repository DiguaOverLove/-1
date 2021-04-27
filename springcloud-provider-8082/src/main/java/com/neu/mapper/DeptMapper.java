package com.neu.mapper;

import com.neu.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> findAll();
    public Dept findById(int id);
}
