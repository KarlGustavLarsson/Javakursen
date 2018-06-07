package org.cinematics.model;

public class Customer {
	private int custId;
	private String name;
	private int age;
	
	public void setCustId(int id) {
		custId = id;
	}
	public int getCustId() {
		return custId;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
}
