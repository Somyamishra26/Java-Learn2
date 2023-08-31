package com.examples;

public class Student {
	private int age;
	private String name;
	private String clgname;
	
	
	
	/*
	 * Student(){
	 * 
	 * }
	 */
	Student(int age,String name,String clgname){
		this.age =age;
		this.name=name;
		this.clgname=clgname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	
	

}
