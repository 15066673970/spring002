package com.jinan.www.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinan.www.bean.User;

public class TestDemo {
	@Test
	public void fun1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
	@Test
	public void fun2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/creobj/applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}

}
