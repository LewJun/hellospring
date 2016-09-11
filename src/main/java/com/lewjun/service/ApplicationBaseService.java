package com.lewjun.service;

import java.util.List;

import com.lewjun.bean.ApplicationBaseBean;

/**
 *
 * @author LewJun
 */
public interface ApplicationBaseService<T extends ApplicationBaseBean> {

	int deleteByPrimaryKey(Integer id) throws Exception;

	int inserts(List<T> ts) throws Exception;

	int insert(T record) throws Exception;

	int insertSelective(T record) throws Exception;

	T selectByPrimaryKey(Integer id) throws Exception;

	List<T> selectAll() throws Exception;

	int updateByPrimaryKeySelective(T record) throws Exception;

	int updateByPrimaryKey(T record) throws Exception;

}
