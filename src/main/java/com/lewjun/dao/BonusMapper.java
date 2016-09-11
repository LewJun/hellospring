package com.lewjun.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lewjun.bean.Bonus;
@Repository
@Transactional
public interface BonusMapper extends ApplicationBaseMapper<Bonus> {
}