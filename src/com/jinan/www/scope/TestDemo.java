package com.jinan.www.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinan.www.bean.User;

public class TestDemo {
	//֤��Ĭ����singleton����ģʽ������ʾΪ����ģʽ�Ķ�����spring������ֻ����I��ʵ��
	@Test
	public void fun1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/scope/applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		User user2 = (User) applicationContext.getBean("user"); 
		System.out.println(user==user2);
	}
	//prototype:����ԭ�Σ�����ʾΪ�����Ķ���ÿ���ٻ�òŻᴴ����ÿ�ζ����µġ�
	@Test
	public void fun2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/scope/applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		User user2 = (User) applicationContext.getBean("user"); 
		System.out.println(user==user2);
	}
}
