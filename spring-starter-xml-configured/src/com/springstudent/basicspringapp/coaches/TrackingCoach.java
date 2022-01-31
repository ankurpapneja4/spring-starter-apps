package com.springstudent.basicspringapp.coaches;

import com.springstudent.basicspringapp.services.FortuneService;

public class TrackingCoach implements Coach {


	//Properties
	private String email;
	private String name;
	private FortuneService fortuneService;
	
	//Create Constructor For Injecting Fortune Service ( Constructor Injection )
	public TrackingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
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
