package com.lewjun;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
	ApplicationContext context = null;

	@Before
	public void initContext() {
		context = new ClassPathXmlApplicationContext("spring.xml");
	}

	@Test
	public void testInitContext() {
		Assert.assertNull("context is null", context);
	}
}
