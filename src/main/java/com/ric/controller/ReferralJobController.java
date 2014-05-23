package com.ric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ric.persistence.model.ReferralJob;
import com.ric.persistence.service.IReferralJobService;
import com.ric.persistence.service.impl.ReferralJobService;

@Controller
public class ReferralJobController { 
	
	@Autowired
	private IReferralJobService service;
	
    public void setService(IReferralJobService service) {
		this.service = service;
	}

	public IReferralJobService getService() {
		return service;
	}

	@RequestMapping("post")
    public String post( Model model) {
    	
    	ReferralJob rj = new ReferralJob();
    	rj.setSkill("java,j2ee,spring,webservices");
    	boolean success = service.create(rj);
    	model.addAttribute("success", success);
    	System.out.println("success ++++++++" + success);
        return "home";
    }

}
