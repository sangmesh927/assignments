package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodDonor;
import com.example.demo.services.DonorService;

@RestController
@RequestMapping(path = "/api/v1/")
@CrossOrigin(origins = "*")
public class DonorController {

	@Autowired
	private DonorService service;
	@GetMapping(path = "donors/{id}")
	public BloodDonor findDonorByDonorID(@PathVariable("id") int id) throws Exception {
		BloodDonor donor = this.service.findDonorByDonorID(id);
		if(donor == null) {
			throw new Exception();
		} else {
			return donor;
		}
	}
	
	
	@GetMapping(path = "donors")
	public List<BloodDonor> findDonors(){
		List<BloodDonor> list = this.service.findAll();
		
			return list;
	}
	@GetMapping(path = "donors/city/{city}")
	public List<BloodDonor> findDonorByCity(@PathVariable("city") String city) {
	
			return this.service.findDonorByCity(city);
		
	}
	
	@GetMapping(path = "donorseligible/city/{city}")
	public List<BloodDonor> findEligibleDonorByCity(@PathVariable("city") String city) {
	
			return this.service.findEligibleDonorByCity(city);
		
	}
	
	@GetMapping(path = "donorseligible/bloodGroup/{bloodGroup}")
	public List<BloodDonor> findEligibleDonorByBloodGroup(@PathVariable("bloodGroup") String bloodGroup) {
	
			return this.service.findEligibleDonorByBloodGroup(bloodGroup);
		
	}
	
	
	
	@GetMapping(path = "donors/bloodgroup/{bloodGroup}")
	public List<BloodDonor> findDonorByBloodGroup(@PathVariable("bloodGroup") String bloodGroup) {
	
			return this.service.findDonorByBloodGroup(bloodGroup);
		
	}
	
	

	@PostMapping(path = "donors")
	public BloodDonor addDoors(@RequestBody BloodDonor donor) {
		BloodDonor responseDonor = this.service.addDonor(donor);
		
			return responseDonor;	
		
	}

	@DeleteMapping(path = "donors/{id}")
	public ResponseEntity<String> deleteDonor(@PathVariable("id") int id) {
		String message = null;
		
			boolean deleted = this.service.removeDonor(id);
			if(deleted) {
				message = "Donor deleted";
				
			} else {
				message = "Donor not present";
			}
			return ResponseEntity.ok().body(message);
	
	}
	

}