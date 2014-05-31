package com.ric.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ric.persistence.model.ReferrMe;
import com.ric.persistence.service.IReferrMeService;
import com.ric.web.json.RererrMeResponse;
import com.ric.web.model.PostRequest;

@RestController
public class ReferrMeController {

	@Autowired
	private IReferrMeService service;

	public IReferrMeService getService() {
		return service;
	}

	@RequestMapping(value = "referrME", method = RequestMethod.GET)
	public RererrMeResponse post(final PostRequest request) {
		
		System.out.println("request payload:" + request);
		
		RererrMeResponse response = new RererrMeResponse();
		ReferrMe refferMe = new ReferrMe();
		refferMe.setTotalExp("6");
		refferMe.setCctc("8");
		refferMe.setEctc("12");
		refferMe.setCompany1("company1");
		refferMe.setCompany2("company2");
		refferMe.setCompany3("company3");
		try {
		  service.create(refferMe);
		  response.setStatus("SUCCESS");
		  response.setStatusMessage("Your referrence sent");
		} catch(Exception e) {
			System.out.println("Error cause:"+e.getCause() + ", Error message:"+e.getMessage());
		} 
		
		return response;
	}
	
}
