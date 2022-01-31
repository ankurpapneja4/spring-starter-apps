package com.springstudent.basicspringapp.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springstudent.basicspringapp.services.FortuneService;

@Component("tennisCoach")
public class TrackingCoach implements Coach {


	//Properties
	private String email;
	private String name;
	
	@Autowired
	private FortuneService fortuneService;
	
		
	//Setter And Getter Method
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Service Method
	@Override
	public String getDailyWorkout() {
		
		return "Run For 20 Min";
	}
	
	
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	
	

}
