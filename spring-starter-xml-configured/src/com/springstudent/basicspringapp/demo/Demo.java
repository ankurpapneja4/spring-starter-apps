package com.springstudent.basicspringapp.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springstudent.basicspringapp.coaches.Coach;

public class Demo {
	public static void main(String[] args) {
		
		//Create Application Context
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationConfiguration.xml");
		
		
		//Get Coach Bean
		Coach coach = applicationContext.getBean("coach",Coach.class);
		
		//Print Coach Email
		//Property Value Passed From application.properties
		System.out.println("Name : " + coach.getName());
		System.out.println("Email : " + coach.getEmail());
		
		//Get Daily WorkOut from Coach
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
	}

}
