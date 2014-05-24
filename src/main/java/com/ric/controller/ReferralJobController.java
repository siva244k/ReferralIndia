package com.ric.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ric.json.PostResponse;
import com.ric.persistence.model.ReferralJob;
import com.ric.persistence.service.IReferralJobService;

@RestController
public class ReferralJobController {

	@Autowired
	private IReferralJobService service;

	public void setService(IReferralJobService service) {
		this.service = service;
	}

	public IReferralJobService getService() {
		return service;
	}

	@RequestMapping(value = "/post",method = RequestMethod.GET)
	public PostResponse post() {
        
		
		ReferralJob rj = new ReferralJob("nag", "Software Engineer",
				"java,j2ee,spring,webservices", "Bangalore", 3, 5, new Date(), new Date());
		
		PostResponse response = new PostResponse();
		try {
		boolean success = service.create(rj);
		
		if(success) {
			response.setStatus("SUCCESS");
			response.setStatusMessage("Job got posted successfully");
		} else {
			response.setStatus("FAILURE");
			response.setStatusMessage("Job not posted successfully");
		}
		} catch(Exception e) {
			response.setStatus("FAILURE");
			response.setStatusMessage("Job not posted successfully");
			System.out.println("error cause : " + e.getCause()  + ", error message : " + e.getMessage());
		}
		
		return response;
	}

}
