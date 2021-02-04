package com.example.demo.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BloodCamp;
import com.example.demo.entity.BloodCampDonor;
import com.example.demo.entity.BloodDonor;


@Controller
public class ClientController {
    
	@Autowired
	private RestTemplate template; 
	
	@Autowired
	private BloodDonor donor;
	
	@Autowired
	private BloodCamp bloodCamp;
	
	@Autowired
	private BloodCampDonor bloodCampDonor;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping(path="/bloodDonorMenu")
	public ModelAndView bloodDonorMenu() {
		mdlView.setViewName("bloodDonorMenu");
        return mdlView;	
	}
	
	@GetMapping(path="/bloodCampMenu")
	public ModelAndView bloodCampMenu() {
		mdlView.setViewName("bloodCampMenu");
        return mdlView;	
	}
	
	
	@GetMapping(path="/addDonor")
	public ModelAndView registerDonor() {
		mdlView.setViewName("addDonor");
	    mdlView.addObject("command",donor);
	    
        return mdlView;	
	}
	
	@GetMapping(path="/showDonors")
	public ModelAndView showDonors() {
		String url = "http://localhost:6565/api/v1/donors";
		ResponseEntity<BloodDonor[]> response = this.template.getForEntity(url, BloodDonor[].class);
		BloodDonor[] donors = response.getBody();
		mdlView.setViewName("showDonors");
		mdlView.addObject("donorsList",Arrays.asList(donors));
		return mdlView;
	}
	
	
	@GetMapping(path="/donorsByBloodGroup")
	public ModelAndView donorsByBloodGroup(@RequestParam("bloodGroup") String bloodGroup) {
		String url = "http://localhost:6565/api/v1/donors/bloodgroup/"+bloodGroup;
		ResponseEntity<BloodDonor[]> response = this.template.getForEntity(url, BloodDonor[].class);
		BloodDonor[] donors = response.getBody();
		mdlView.setViewName("showDonors");
		mdlView.addObject("donorsList",Arrays.asList(donors));
		return mdlView;
		
	}
	
	@GetMapping(path="/donorsByCity")
	public ModelAndView donorsBYCity(@RequestParam("city") String city) {
		String url = "http://localhost:6565/api/v1/donors/city/"+city;
		ResponseEntity<BloodDonor[]> response = this.template.getForEntity(url, BloodDonor[].class);
		BloodDonor[] donors = response.getBody();
		mdlView.setViewName("showDonors");
		mdlView.addObject("donorsList",Arrays.asList(donors));
		return mdlView;
		
	}
	
	
	@GetMapping(path="/registerBloodCamp")
	public ModelAndView registerBloodCamp() {
		mdlView.setViewName("registerBloodCamp");
	    mdlView.addObject("command",bloodCamp);
        return mdlView;	
	}
	
	@PostMapping(path="/registerBloodCamp")
	public ModelAndView onSubmitRegisterBloodCamp(@ModelAttribute("command") BloodCamp bloodCamp) {
		
		BloodCamp added=this.template.postForObject("http://localhost:6565/api/registerBloodCamp", bloodCamp, BloodCamp.class);
		String message="Blood Camp added";
		mdlView.setViewName("success");
		mdlView.addObject("message",message);
		mdlView.addObject("added",added);

		return mdlView;
		
	}
	
	
	@PostMapping(path="/registerDonorForBloodCamp")
	public ModelAndView registerDonorForBloodCamp(@ModelAttribute("command") BloodCampDonor bloodCampDonor) {
		
		BloodCampDonor added=this.template.postForObject("http://localhost:6565/api/registerDonor", bloodCampDonor, BloodCampDonor.class);
		String message="donor added to camp";
		mdlView.setViewName("success");
		mdlView.addObject("message",message);
		mdlView.addObject("added",added);

		return mdlView;
		
	}
	
	@GetMapping(path="/updateDonor")
	public ModelAndView updateInit() {
		mdlView.setViewName("updateDonor");
	    mdlView.addObject("command",donor);
        return mdlView;	
	}
	
	@GetMapping(path="/deleteDonor")
	public ModelAndView deleteInit() {
		mdlView.setViewName("deleteDonor");
	    mdlView.addObject("command",donor);
        return mdlView;	
	}
	
	@PostMapping(path="/submit")
	public ModelAndView onSubmit(@ModelAttribute("command") BloodDonor donor) {
		donor.setAge();
		BloodDonor added=this.template.postForObject("http://localhost:6565/api/v1/donors", donor, BloodDonor.class);
		String message="Donor added";
		mdlView.setViewName("success");
		mdlView.addObject("message",message);
		mdlView.addObject("added",added);

		return mdlView;
		
	}
	
	
	
	

	@PostMapping(path="/delete")
	public ModelAndView onDeleteSubmit(@RequestParam("id") int id) {
		String message="Donor deleted";
		String url = "http://localhost:6565/api/v1/donors/"+id;
		this.template.delete(url);
		mdlView.addObject("message",message);
		mdlView.setViewName("success");
		return mdlView;
		
	}
	
	
	@PostMapping(path = "/updateDonor")
	public ModelAndView updateUserData(@ModelAttribute("command") BloodDonor donor) {
		int id = donor.getDonorId();
		String url = "http://localhost:6565/api/v1/donors/"+id;
		this.template.put(url,donor);;
		mdlView.setViewName("success");
		mdlView.addObject("message", "Donor updated successfully");
		return mdlView;
	}
	
	//**********************blood Camp *****************************
	
	@GetMapping(path="/addBloodCamp")
	public ModelAndView addBloodCamp() {
		mdlView.setViewName("addBloodCamp");
        return mdlView;	
	}
	
	
	@GetMapping(path="/deleteBloodCamp")
	public ModelAndView deleteBloodCamp() {
		mdlView.setViewName("deleteBloodCamp");
        return mdlView;	
	}
	
	@GetMapping(path="/registerDonorForBloodCamp")
	public ModelAndView registerDonorForBloodCamp() {
		mdlView.setViewName("registerDonorForBloodCamp");
		mdlView.addObject("command",bloodCampDonor);
        return mdlView;	
	}
	
	@GetMapping(path="/getRegisteredDonors")
	public ModelAndView getRegisteredDonors() {
		
		String url = "http://localhost:6565/api/bloodCamps/";
		ResponseEntity<BloodCampDonor[]> response = this.template.getForEntity(url, BloodCampDonor[].class);
		BloodCampDonor[] bloodCampDonor = response.getBody();
		mdlView.setViewName("showRegisteredDonors");
		mdlView.addObject("donorsList",Arrays.asList(bloodCampDonor));
		return mdlView;
		
	}
	
	
	
	
	@GetMapping(path="/showAllBloodCamps")
	public ModelAndView showBloodCamps() {
		String url = "http://localhost:6565/api/bloodCamps";
		ResponseEntity<BloodCamp []> response = this.template.getForEntity(url, BloodCamp[].class);
		BloodCamp[] bloodCampList = response.getBody();
		mdlView.setViewName("showBloodCamps");
		mdlView.addObject("bloodCampList",Arrays.asList(bloodCampList));
		return mdlView;
	}
	
	
	@GetMapping(path="/showBloodCampsByPlace")
	public ModelAndView showBloodCampsByPlace(@RequestParam("place") String place) {
		String url = "http://localhost:6565/api/bloodCamps/place/"+place;
		ResponseEntity<BloodCamp []> response = this.template.getForEntity(url, BloodCamp[].class);
		BloodCamp[] bloodCampList = response.getBody();
		mdlView.setViewName("showBloodCamps");
		mdlView.addObject("bloodCampList",Arrays.asList(bloodCampList));
		return mdlView;
		
	}
	
	

}
