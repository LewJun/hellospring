package com.lewjun.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lewjun.bean.ApplicationBaseBean;

/**
 *
 * @author LewJun
 */
@Repository
public interface ApplicationBaseMapper<T extends ApplicationBaseBean> {

	int deleteByPrimaryKey(Integer id);

	int inserts(List<T> ts);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Integer id);

	List<T> selectAll();

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

}
