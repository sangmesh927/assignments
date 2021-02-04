package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.BloodCampDonor;
import com.example.demo.repos.BloodCampDonorRegistrationRepository;


@Service
public class BloodCampDonorRegistrationServices {

	@Autowired
	private BloodCampDonorRegistrationRepository repo;
	
	public BloodCampDonor registerDonor(BloodCampDonor donorRegistered) {
		return this.repo.save(donorRegistered);
	}
	
	public List<BloodCampDonor> findAll() {
		return this.repo.findAll();
	}
	
}
