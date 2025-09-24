package com.example.demo;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {

	@RequestMapping(value = "/birthday/{year}/{month}/{day}")
	public int showAge(@PathVariable int year,
			@PathVariable int month,
			@PathVariable int day) {

		LocalDate birthday = LocalDate.of(year, month, day);

		LocalDate today = LocalDate.now();

		Period period = Period.between(birthday, today);
		int age = period.getYears();

		return age;
	}
}
