package com.example.demo.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodDonor {
	int donorId;
	String name;
	int age;
	int mobileNumber;
	String gender;
	String bloodGroup;
	String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate dateOfBirth;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate lastDateOFDonation;
	String city;
	private static int getAge(LocalDate dateOfBirth) {
		
		LocalDate now = LocalDate.now();
		Period p=Period.between(dateOfBirth,now);
		return p.getYears();
		
	}
	public void setAge() {
		this.age=getAge(this.dateOfBirth);
	}
	
}
