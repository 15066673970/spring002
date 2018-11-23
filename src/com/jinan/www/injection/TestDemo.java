package com.jinan.www.injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	//����set��ʽע��ķ���
	@Test
	public void fun1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/injection/applicationContext.xml");
		Teacher teacher1 = (Teacher) applicationContext.getBean("teacher1");
		System.out.println(teacher1);
		
		
	}
	//���Թ��캯��ע��ķ���
	@Test
	public void fun2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/injection/applicationContext.xml");
		Teacher teacher2= (Teacher) applicationContext.getBean("teacher2");
		System.out.println(teacher2);
	}
	
	//���Թ��캯��ע��ķ���2
	@Test
	public void fun3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/injection/applicationContext.xml");
		Teacher teacher3= (Teacher) applicationContext.getBean("teacher3");
		System.out.println(teacher3);
	}
	
	//����p���ƿռ�ע��
	@Test
	public void fun4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/injection/applicationContext.xml");
		Teacher teacher4 = (Teacher) applicationContext.getBean("teacher4");
		System.out.println(teacher4);
	}
	
	//����spelע��
	@Test
	public void  fun5() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/injection/applicationContext.xml");
		Teacher teacher5 = (Teacher) applicationContext.getBean("teacher5");
		System.out.println(teacher5);
	}
	//���Ը�������ע��
	@Test
	public void  fun6() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/injection/applicationContext.xml");
		CollectionBean collectionBean  = (CollectionBean) applicationContext.getBean("cb");
		System.out.println(collectionBean);
	}
}
