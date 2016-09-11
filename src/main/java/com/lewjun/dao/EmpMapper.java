package com.lewjun.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lewjun.bean.Emp;

@Repository
@Transactional
public interface EmpMapper  extends ApplicationBaseMapper<Emp>{ }