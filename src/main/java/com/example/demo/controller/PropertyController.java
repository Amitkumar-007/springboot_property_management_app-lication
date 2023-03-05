package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PropertyDTO;
import com.example.demo.service.PropertyService;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;
	
	
	//http://localhost:8080/api/v1/hello
	@GetMapping("/hello")
	public String sayHello() { 
		System.out.println("demodto");
		return "hello";
	}
	
	@PostMapping("/properties")
	public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO) {
		System.out.println(propertyDTO);
		propertyService.saveProperty(propertyDTO);
		return propertyDTO;
	}

}
