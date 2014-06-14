package com.ric.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ric.persistence.model.Company;
import com.ric.persistence.model.SearchPreference;
import com.ric.persistence.model.User;
import com.ric.persistence.model.UserProfile;
import com.ric.persistence.service.IUserService;
import com.ric.web.json.RererrMeResponse;
import com.ric.web.model.PostRequest;

@RestController
public class ReferrMeController {

	@Autowired
	private IUserService service;

	public IUserService getService() {
		return service;
	}

	@RequestMapping(value = "referME", method = RequestMethod.GET)
	public RererrMeResponse post(final PostRequest request) {
		
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
		
		User usr = new User();
		usr.setUserName("sbrnag");
		usr.setFirstName("nagendra prasad");
		usr.setLastName("sbr");
		usr.setPassword("Ric34306786");
		usr.setPerEmail("nagendra.sbr@gmail.com");
		usr.setProfile(up);
		
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
