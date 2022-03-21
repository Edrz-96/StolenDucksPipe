package com.qa.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.main.domain.Car;
import com.qa.main.domain.Driver;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);
		System.out.println(context.getBean("startTime", String.class));
		// Below will check dependency injection >> 
				Car car = context.getBean(Car.class);
		//		car.testMethod();
	
	}

}
