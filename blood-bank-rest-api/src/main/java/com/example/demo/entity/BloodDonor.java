package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name="donorTab1")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BloodDonor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int donorId;
	String name;
	int age;
	int mobileNumber;
	String gender;
	String bloodGroup;
	String email;
	LocalDate dateOfBirth;
	LocalDate lastDateOFDonation;
	String city;
}
