package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AgeDecade {
	@RequestMapping(value = "/hello")
	public String helloQueryString(@RequestParam String name, @RequestParam int age) {
		age = age + 10;
		return "こんにちは" + name + "さん。10年後は" + age + "歳ですね!";
	}
}
