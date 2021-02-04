package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BloodCamp;
import com.example.demo.entity.BloodCampDonor;
import com.example.demo.entity.BloodDonor;


@SpringBootApplication
public class BloodBankMvcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodBankMvcClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
		
	}
	@Bean
	public ModelAndView modelAndView() {
		return new ModelAndView();
		
	}
	
	@Bean
	public BloodDonor bloodDonor() {
		return new BloodDonor();
		
	}
	
	@Bean
	public BloodCamp bloodcamp() {
		return new BloodCamp();
		
	}
	
	@Bean
	public BloodCampDonor bloodcampDonor() {
		return new BloodCampDonor();
		
	}

}
