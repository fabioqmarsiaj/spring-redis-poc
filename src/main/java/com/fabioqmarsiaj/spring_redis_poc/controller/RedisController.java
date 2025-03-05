package com.fabioqmarsiaj.spring_redis_poc.controller;

import com.fabioqmarsiaj.spring_redis_poc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	@Autowired
	private RedisService service;

	@GetMapping("/save-data")
	public String saveData(){
		service.saveData("key test", "value test");
		return "Data saved succesfully";
	}

	@GetMapping("/get-data")
	public String getData(){
		var value = service.getData("key test");
		return "Data recovered: " + value;
	}
}
