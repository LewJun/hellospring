package com.lewjun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lewjun.bean.ApplicationBaseBean;
import com.lewjun.dao.ApplicationBaseMapper;
import com.lewjun.service.ApplicationBaseService;

/**
 *
 * @author LewJun
 */
public abstract class ApplicationBaseServiceImpl<T extends ApplicationBaseBean> implements ApplicationBaseService<T> {
	@Autowired
	ApplicationBaseMapper<T> applicationBaseMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		return applicationBaseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int inserts(List<T> ts) throws Exception {
		return applicationBaseMapper.inserts(ts);
	}

	@Override
	public int insert(T record) throws Exception {
		return applicationBaseMapper.insert(record);
	}

	@Override
	public int insertSelective(T record) throws Exception {
		return applicationBaseMapper.insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(Integer id) throws Exception {
		return applicationBaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<T> selectAll() throws Exception {
		return applicationBaseMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKeySelective(T record) throws Exception {
		return applicationBaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) throws Exception {
		return applicationBaseMapper.updateByPrimaryKey(record);
	}

}
