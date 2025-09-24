package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // URL: /hello/{name}/{age}
    @RequestMapping(value = "/hello/{name}/{age}")
    public String helloPathParameter(@PathVariable String name, @PathVariable int age) {
        age = age + 10;
        return "こんにちは" + name + "さん。10年後は" + age + "歳ですね!";
    }
}
