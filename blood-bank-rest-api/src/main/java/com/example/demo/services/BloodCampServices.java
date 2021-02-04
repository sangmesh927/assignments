package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodCamp;
import com.example.demo.repos.BloodCampRepository;


@Service
public class BloodCampServices {

	@Autowired
	private BloodCampRepository repo;
	
	public BloodCamp registerBloodCamp(BloodCamp bloodCamp){
		return this.repo.save(bloodCamp);
	}
	
	public List<BloodCamp> findAllBloodCamps(){
		return this.repo.findAll();
	}
	
	public List<BloodCamp> findBloodCampByPlace(String place){
		return this.repo.findByPlace(place);
	}

}
