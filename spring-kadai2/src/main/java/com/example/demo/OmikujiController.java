package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OmikujiController {
	@PostMapping("/omikuji")
	public String omikuji(@RequestParam String name, Model model) {

		Random rand = new Random();
		int num = rand.nextInt(6);

		String result = "";
		switch (num) {
		case 0:
			result = "大吉";
			break;

		case 1:

		case 2:

		case 3:
			result = "吉";
			break;

		case 4:
			result = "小吉";
			break;
			
		case 5:
			result = "凶";
			break;
		}

		model.addAttribute("name", name);
		model.addAttribute("result", result);

		return "omikujiResult";
	}
}
