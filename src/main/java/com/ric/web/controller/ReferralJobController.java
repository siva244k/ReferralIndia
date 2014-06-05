package com.ric.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ric.persistence.model.ReferralJob;
import com.ric.persistence.service.IReferralJobService;
import com.ric.web.json.PostResponse;
import com.ric.web.model.PostRequest;

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

	@RequestMapping(value = "post", method = RequestMethod.POST)
	public PostResponse post(final PostRequest request) {
		
		System.out.println("request payload:" + request);
		
		PostResponse response = new PostResponse();
		ReferralJob rj = new ReferralJob();
		rj.setSkill(request.getSkill());
		rj.setPosition(request.getPosition());
		rj.setExpTo(request.getExpTo());
		try {
		  service.create(rj);
		  response.setStatus("SUCCESS");
		  response.setStatusMessage("Job got posted successfully");
		} catch(Exception e) {
			System.out.println("Error cause:"+e.getCause() + ", Error message:"+e.getMessage());
		} 
		
		return response;
	}
	
	@RequestMapping("home")
	public ModelAndView getHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("layout/my-layout");
		return mv;
	}

}
