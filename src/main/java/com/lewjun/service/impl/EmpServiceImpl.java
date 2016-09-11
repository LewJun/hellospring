package com.lewjun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewjun.bean.Emp;
import com.lewjun.dao.EmpMapper;
import com.lewjun.service.EmpService;

/**
 *
 * @author LewJun
 */
@Service
public class EmpServiceImpl extends ApplicationBaseServiceImpl<Emp> implements EmpService {
	@Autowired
	EmpMapper empMapper;
}
