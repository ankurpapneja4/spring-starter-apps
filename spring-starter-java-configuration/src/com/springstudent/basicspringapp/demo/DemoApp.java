package com.springstudent.basicspringapp.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springstudent.basicspringapp.coaches.Coach;
import com.springstudent.basicspringapp.configuration.SpringApplicationConfiguration;

public class DemoApp {
	public static void main(String[] args) {
		
		//Create Application Context
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringApplicationConfiguration.class);
		
		//Get Bean Coach
		Coach coach = applicationContext.getBean("tennisCoach", Coach.class);
		
		//Print DailyWorkout and DailyFortune
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		
	}

}
