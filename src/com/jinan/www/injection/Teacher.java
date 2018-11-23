package com.jinan.www.injection;

public class Teacher {

	private String name;
	private Integer age;
	private Car car;
	public Teacher() {
	}
	
	
	public Car getCar() {
		return car;
	}

	//为了使用构造函数方式的注入必须要加入带参数的构造方法
	public Teacher(String name, Integer age, Car car) {
		System.out.println("name,age,car");
		this.name = name;
		this.age = age;
		this.car = car;
	}
	//为了使用构造函数方式的注入必须要加入带参数的构造方法2
		public Teacher(Car car,String name, Integer age) {
			System.out.println("car,name,age");
			this.name = name;
			this.age = age;
			this.car = car;
		}
	//为了使用构造函数方式的注入必须要加入带参数的构造方法3
		public Teacher(Car car,Integer name, String age) {
			System.out.println("car,name(i),age(s)");
			this.name = name+"";
			this.age = Integer.parseInt(age);
			this.car = car;
		}
	
	
	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
	
	
}
