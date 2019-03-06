package com.shaon.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:\\Users\\LENOVO\\Desktop\\sample.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<String> lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  lines.add(sc.nextLine());
		}

		String[] arrayFortune = lines.toArray(new String[0]);
		//String[] arrayFortune = {"Bad", "Medium", "Good"};
		int position = (int) ((Math.random()*100) % arrayFortune.length);
		return arrayFortune[position];
	}

}
