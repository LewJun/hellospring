package com.lewjun.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lewjun.bean.Salgrade;

@Repository
@Transactional
public interface SalgradeMapper extends ApplicationBaseMapper<Salgrade> {
}