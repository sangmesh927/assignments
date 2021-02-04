package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodCamp;
import com.example.demo.entity.BloodCampDonor;
import com.example.demo.services.BloodCampDonorRegistrationServices;


@RestController
@RequestMapping(path = "/api/")
public class BloodCampRegistrationControllers {

	@Autowired
	private BloodCampDonorRegistrationServices service; 
	
	
	@PostMapping(path = "registerDonor")
	public BloodCampDonor registerDonor(@RequestBody  BloodCampDonor donorRegistered)  {
		return this.service.registerDonor(donorRegistered);
	}
	
	@GetMapping(path = "findAllRegistredDonors")
	public List<BloodCampDonor> findAllRegistredDonors() {
		return this.service.findAll();
	}
	
	
	
}
