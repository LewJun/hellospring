package com.lewjun.service;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lewjun.ApplicationBaseServiceTest;
import com.lewjun.bean.Bonus;
import com.lewjun.service.BonusService;

/**
 *
 * @author LewJun
 */
public class BonusServiceTest extends ApplicationBaseServiceTest {

	@Autowired
	BonusService bonusService;

	@Test
	public void test_selectByPrimaryKey() throws Exception {
		Bonus bonus = bonusService.selectByPrimaryKey(2);
		LOGGER.info("bonus={}", bonus);
	}

	@Test
	public void test_insert() throws Exception {
		Bonus record = new Bonus();
		record.setEmpno(72);
		record.setPaytime(new Date());
		record.setSal(new BigDecimal(1111.11));
		record.setComm(new BigDecimal(22.22));
		bonusService.insert(record);
	}
}
