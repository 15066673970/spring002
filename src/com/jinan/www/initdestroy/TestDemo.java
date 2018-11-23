package com.jinan.www.initdestroy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	
	@Test
	public void fun1() {
	  ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jinan/www/initdestroy/applicationContext.xml");
	  
	  Student student = (Student) applicationContext.getBean("student");
	  
	  System.out.println(student);
	  //关闭容器，触发销毁方法
	  applicationContext.close();
	  
	}

}
