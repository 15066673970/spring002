package com.jinan.www.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinan.www.bean.User;

public class TestDemo {
	//证明默认是singleton单例模式：被标示为单例模式的对象在spring容器中只会有I个实例
	@Test
	public void fun1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/scope/applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		User user2 = (User) applicationContext.getBean("user"); 
		System.out.println(user==user2);
	}
	//prototype:多例原形，被标示为多例的对象，每次再获得才会创建，每次都是新的。
	@Test
	public void fun2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/scope/applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		User user2 = (User) applicationContext.getBean("user"); 
		System.out.println(user==user2);
	}
}
