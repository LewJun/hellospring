package com.lewjun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewjun.bean.Bonus;
import com.lewjun.dao.BonusMapper;
import com.lewjun.service.BonusService;

/**
 *
 * @author LewJun
 */
@Service
public class BonusServiceImpl extends ApplicationBaseServiceImpl<Bonus> implements BonusService {
	@Autowired
	BonusMapper bonusMapper;

	@Override
	public int insert(Bonus record) throws Exception {
		int count = bonusMapper.insert(record);
		return count;
	}
}
