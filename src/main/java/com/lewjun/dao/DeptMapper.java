package com.lewjun.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lewjun.bean.Dept;

@Repository
@Transactional
public interface DeptMapper extends ApplicationBaseMapper<Dept> {
}