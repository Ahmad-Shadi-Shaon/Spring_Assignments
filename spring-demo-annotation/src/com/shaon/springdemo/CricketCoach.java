package com.shaon.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do 30 mins workout";
	}

	 @Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	 

}
