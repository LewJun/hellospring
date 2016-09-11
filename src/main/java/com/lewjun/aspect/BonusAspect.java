package com.lewjun.aspect;

import java.math.BigDecimal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.lewjun.bean.Bonus;

/**
 *
 * @author LewJun
 */
@Component
@Aspect
@Order(value = -1)
public class BonusAspect /* 一个aop不能扩展自一个具体的aop extends ApplicationBaseAspect */ {

	protected static final Logger LOGGER = LoggerFactory.getLogger(BonusAspect.class);

	// @Around("execution(*
	// com.lewjun.service.BonusService.deleteByPrimaryKey(..))")
	// public int deleteByPrimaryKey(ProceedingJoinPoint jp) {
	// LOGGER.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	// return 0;
	// }

	// int inserts(List<Bonus> ts);

	// insert方法由BonusService继承自ApplicationBaseService，如果不在实现类BonusServiceImpl中实现，那么这里的环绕通知不能截取到
	@Around("execution(* com.lewjun.service.BonusService.insert(..))")
	public Object insert(ProceedingJoinPoint jp) throws Throwable {
		Object[] args = jp.getArgs();

		if (args[0] instanceof Bonus) {
			Bonus bonus = (Bonus) args[0];
			bonus.setComm(new BigDecimal(33.33));
		}

		LOGGER.info("【args:{}】", args);
		Object result = jp.proceed();
		LOGGER.info("【result:{}】", result);

		return result;
	}

	//
	// List<T> selectAll();
	//
	// int updateByPrimaryKeySelective(T record);
	//
	// int updateByPrimaryKey(T record);

}
