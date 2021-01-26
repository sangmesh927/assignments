package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repos.DonorRepository;
@Service
public class DonorService {

	@Autowired
	private DonorRepository repo;
	 
	public List<BloodDonor> findAll(){
		return this.repo.findAll();
	}
	
	public BloodDonor addDonor(BloodDonor donor) {
		return this.repo.save(donor);
	}
	
	public BloodDonor findDonorByDonorID(int id) {
		return this.repo.findByDonorId(id);
	}
	
	public List<BloodDonor> findDonorByCity(String city) {
		return this.repo.findByCity(city);
	}
	
	public List<BloodDonor> findDonorByBloodGroup(String bloodGroup) {
		return this.repo.findByBloodGroup(bloodGroup);
	}
	
	public List<BloodDonor> findEligibleDonorByBloodGroup(String bloodGrup){
		return this.repo.findEligibleDonorByBloodGroup(bloodGrup);
	}
	public List<BloodDonor> findEligibleDonorByCity(String city) {
		return this.repo.findEligibleDonorByCity(city);
	}
	public boolean removeDonor(int id) {
		boolean deleted = false;
		
		if(this.repo.existsById(id)) {
			this.repo.deleteById(id);
			deleted = true;
		}
		return deleted;
	}
}
