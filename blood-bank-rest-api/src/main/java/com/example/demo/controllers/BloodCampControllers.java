package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodCamp;
import com.example.demo.services.BloodCampServices;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "*")
public class BloodCampControllers {

	@Autowired
	private BloodCampServices service;
	
	@PostMapping(path ="registerBloodCamp")
	public BloodCamp registerBloodCamp(@RequestBody BloodCamp bloodCamp) {
		return this.service.registerBloodCamp(bloodCamp);	
	}

	@GetMapping(path = "bloodCamps")
	public List<BloodCamp> findAllBloodCamps() {
		return this.service.findAllBloodCamps();
	}
	

	@GetMapping(path = "bloodCamps/place/{place}")
	public List<BloodCamp> findCampUsingArea(@PathVariable("place") String place){
		return this.service.findBloodCampByPlace(place);
		
	}
	
}
