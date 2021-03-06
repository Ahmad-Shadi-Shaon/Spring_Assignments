package com.shaon.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class SwimCoach implements Coach {
	
    private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "daily workout" ;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
