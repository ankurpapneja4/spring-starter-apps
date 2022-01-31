package com.springstudent.basicspringapp.services;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a happy day";
	}

}
