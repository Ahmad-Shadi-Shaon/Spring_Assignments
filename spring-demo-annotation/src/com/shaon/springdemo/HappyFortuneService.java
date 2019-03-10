package com.shaon.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	private List<String> lines;

	@Override
	public String getFortune() {
		String[] arrayFortune = lines.toArray(new String[0]);
		//String[] arrayFortune = {"Bad", "Medium", "Good"};
		int position = (int) ((Math.random()*100) % arrayFortune.length);
		return arrayFortune[position];
	}
	
	@PostConstruct
	public void getFortuneValues()
	{
		System.out.println("Post construction started.");
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\Users\\LENOVO\\Desktop\\sample.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  lines.add(sc.nextLine());
		}
		
	}

}
