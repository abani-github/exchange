package com.adobe.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adobe.exchange.configs.HalloConfig;


@RestController
public class HelloController {
	
	@Autowired
	HalloConfig halloConfig;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return halloConfig.getGreeting() + name;
	}
	
}
