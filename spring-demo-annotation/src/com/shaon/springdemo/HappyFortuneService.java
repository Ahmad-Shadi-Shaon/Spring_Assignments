package com.shaon.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] arrayFortune = {"Bad", "Medium", "Good"};
		int position = (int) ((Math.random()*100) % arrayFortune.length);
		return arrayFortune[position];
	}

}
