package com.lewjun.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author LewJun
 */
@Component
@Aspect
@Order(-Integer.MAX_VALUE)
public /* 修饰符必须是public 不能有其它 */ class ApplicationBaseAspect {
	protected static final Logger LOGGER = LoggerFactory.getLogger(ApplicationBaseAspect.class);

	@Around("execution(* com.lewjun.service.*.**(..))")
	public Object aspectAll(ProceedingJoinPoint jp) throws Throwable {
		LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		LOGGER.info("【方法名：{}】", jp.getSignature());
		Object[] args = jp.getArgs();
		LOGGER.info("【args:{}】", args);
		Object result = jp.proceed();
		LOGGER.info("【after proceed, result:{}】", result);
		LOGGER.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		return result;
	}

	@AfterThrowing(pointcut = "execution(* com.lewjun.service.*.**(..))", throwing = "ex")
	public void afterThrowException(JoinPoint jp, Throwable ex) {
		LOGGER.info("exexexexexex>>>>>>>>>>>>>>>");
		LOGGER.info("【方法名：{}】", jp.getSignature());
		Object[] args = jp.getArgs();
		LOGGER.info("【args:{}】", args);
		LOGGER.error("【出现异常】", ex);
		LOGGER.info("<<<<<<<<<<<<<<<exexexexexex");
	}
}
