package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodCamp;
@Repository
public interface BloodCampRepository extends JpaRepository<BloodCamp, Integer> {

	
	public List<BloodCamp> findByPlace(String place);
	
}
