package com.qa.main.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
public class Car {

	@Autowired // without injecting the dependency, Spring can't identify said dependcy for
	private Driver d;

	private String model;
	private String Colour;
	private int miles;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public Car() {
		System.out.println("Car created");
	}

	public void testMethod() {
		System.out.println("Checking driver");
		d.goingForDrive();

	}

}
