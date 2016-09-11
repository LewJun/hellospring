package com.lewjun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewjun.bean.Dept;
import com.lewjun.dao.DeptMapper;
import com.lewjun.service.DeptService;

/**
 *
 * @author LewJun
 */
@Service
public class DeptServiceImpl extends ApplicationBaseServiceImpl<Dept> implements DeptService {
	@Autowired
	DeptMapper deptMapper;
}
