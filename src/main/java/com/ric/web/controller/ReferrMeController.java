package com.ric.web.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ric.persistence.model.Company;
import com.ric.persistence.model.ReferralJob;
import com.ric.persistence.model.SearchPreference;
import com.ric.persistence.model.User;
import com.ric.persistence.model.UserProfile;
import com.ric.persistence.service.IUserService;
import com.ric.web.json.RererrMeResponse;
import com.ric.web.model.ReferralJobBO;

@RestController
public class ReferrMeController {

	@Autowired
	private IUserService service;

	public IUserService getService() {
		return service;
	}

	@RequestMapping(value = "referrME", method = RequestMethod.GET)
	public RererrMeResponse post(final ReferralJobBO request) {
		
		System.out.println("request payload:" + request);
		
		SearchPreference sp = new SearchPreference();
		sp.setExp("6");
		
		Company c1 = new Company();
		c1.setCompanyName("Zenith");
		
		Company c2 = new Company();
		c2.setCompanyName("Capco");
		
		Company c3 = new Company();
		c3.setCompanyName("Nttdata");
		
		List<Company> companies = new ArrayList<Company>();
		companies.add(c1);
		companies.add(c2);
		companies.add(c3);
		
		UserProfile up = new UserProfile();
		up.setNoticePeriod("2 months");
		up.setCctc("8 lacs");
		up.setEctc("12 lacs");
		up.setSearchPreference(sp);
		up.setCompanies(companies);
		
		ReferralJob rj1 = new ReferralJob();
		rj1.setSkill("java");
		rj1.setPosition("lead");
		rj1.setExpTo(3);
		
		ReferralJob rj2 = new ReferralJob();
		rj2.setSkill(".net");
		rj2.setPosition("sse");
		rj2.setExpTo(2);
		
		ReferralJob rj3 = new ReferralJob();
		rj3.setSkill("QA");
		rj3.setPosition("se");
		rj3.setExpTo(1);
		
		Set<ReferralJob> jobs = new HashSet<ReferralJob>();
		jobs.add(rj1);
		jobs.add(rj2);
		jobs.add(rj3);
		
		int id = 1;
		User usr1 = service.findOne(id);
		
		
		User usr = new User();
		usr.setUserName("sbrnag");
		usr.setFirstName("nagendra prasad");
		usr.setLastName("sbr");
		usr.setPassword("Ric34306786");
		usr.setPerEmail("nagendra.sbr@gmail.com");
		usr.setProfile(up);
		usr.setReferralJobs(usr1.getReferralJobs());
		
		RererrMeResponse response = new RererrMeResponse();
		try {
		  service.create(usr);
		  List<User> users  = service.findAll();
		  for(User user : users) {
			  System.out.println(user);
		  }
		  
		  response.setStatus("SUCCESS");
		  response.setStatusMessage("Your referrence sent");
		} catch(Exception e) {
			System.out.println("Error cause:"+e.getCause() + ", Error message:"+e.getMessage());
		} 
		
		return response;
	}
	
}
