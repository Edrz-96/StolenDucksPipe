package com.qa.main.domain;

import org.springframework.stereotype.Component;

@Component
public class Driver {

	private String name;
	private int age;

	public void goingForDrive() {
		System.out.println("Driving");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "]";
	}

}
