package com.jinan.www.initdestroy;

public class Student {

		private String name;
		private Integer age;
		
		
		public Student() {
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
			return "Student [name=" + name + ", age=" + age + "]";
		}
		
		public void initMethod() {
			System.out.println("初始化方法");
		}
		public void destroyMethod() {
			System.out.println("销毁的方法");
		}
}
