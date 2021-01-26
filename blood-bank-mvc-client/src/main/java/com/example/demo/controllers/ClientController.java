package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BloodDonor;

@Controller
public class ClientController {
    
	@Autowired
	private RestTemplate template; 
	
	@Autowired
	private BloodDonor donor;
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping(path="/donor")
	public ModelAndView init() {
		mdlView.setViewName("addDonor");
	    mdlView.addObject("command",donor);
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
		mdlView.setViewName("success");
		mdlView.addObject("added",added);

		return mdlView;
		
	}
	
	
	
	@PostMapping(path="/delete")
	public ModelAndView onDeleteSubmit(@RequestParam("id") int id) {
		String url = "http://localhost:6565/api/v1/donors/"+id;
		this.template.delete(url);
		mdlView.setViewName("success");
		return mdlView;
		
	}
	
}
