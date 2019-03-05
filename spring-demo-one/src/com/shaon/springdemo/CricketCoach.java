package com.shaon.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
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
