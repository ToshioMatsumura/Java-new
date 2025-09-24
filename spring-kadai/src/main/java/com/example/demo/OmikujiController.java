package com.example.demo;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OmikujiController {

	@RequestMapping( "/omikuji")

	public String omikuji() {

		Random rand = new Random();

		int num = rand.nextInt(6);

		String result = "";

		switch (num) {

		case 0:
			result = "大吉";
			break;

		case 1, 2, 3:
			result = "吉";
			break;

		case 4:
			result = "小吉";
			break;

		case 5:
			result = "凶";
			break;

		}
		return result;
	}
}
