package com.jinan.www.injection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {

	private Object[] arr;//数组类型注入
	private List list;//list/set 类型注入
	private Map map;//map类型注入
	private Properties properties;//properties类型注入
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list + ", map=" + map + ", properties="
				+ properties + "]";
	}
	
	
	
}
