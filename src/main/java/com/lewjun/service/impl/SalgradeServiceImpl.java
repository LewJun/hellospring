package com.lewjun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewjun.bean.Salgrade;
import com.lewjun.dao.SalgradeMapper;
import com.lewjun.service.SalgradeService;

/**
 *
 * @author LewJun
 */
@Service
public class SalgradeServiceImpl extends ApplicationBaseServiceImpl<Salgrade> implements SalgradeService { 
	@Autowired
	SalgradeMapper salgradeMapper;
}
