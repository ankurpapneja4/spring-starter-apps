package com.springstudent.basicspringapp.services;
import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a happy day";
	}

}
