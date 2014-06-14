package com.ric.web.controller;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ric.persistence.model.User;
import com.ric.persistence.service.IUserService;
import com.ric.web.model.UserBO;

@Controller
public class LoginController {

	@Autowired
	private IUserService service;

	static final Logger log = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {

		ModelAndView mv = new ModelAndView();
		log.info("Login Page is going to lauch ");
		mv.setViewName("login");
		return mv;

	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username,
			@RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView();

		if (service.authenticate(username, password)) {
			log.info("login authenitcation succes home page is going to launch  ");
			mv.setViewName("home");
		} else
			mv.setViewName("login");

		return mv;

	}

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public ModelAndView signup(Map<String, Object> model) {
		ModelAndView mv = new ModelAndView();
		UserBO userBO = new UserBO();

		log.info("signup page launched ");
		model.put("userBO", userBO);
		mv.setViewName("signup");
		return mv;

	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public ModelAndView register(@Valid UserBO userBO, BindingResult result) {

		ModelAndView mv = new ModelAndView();

		User user = new User();

		if (result.hasErrors()) {

			mv.setViewName("signup");
		} else {
			user = populate(userBO);

			try {
				if (!service.searchByUserName(user.getUserName())) {
					log.info("registering the user ");
					service.create(user);
					mv.setViewName("home");
				} else {
					mv.setViewName("signup");
				}

			} catch (Exception e) {
				log.error("Error cause:{} Error message:{}", e.getCause(),
						e.getMessage());
			}
		}

		return mv;

	}

	public User populate(UserBO bo) {
		User user = new User();
		user.setUserName(bo.getUserName());
		user.setPassword(bo.getPassword());
		user.setFirstName(bo.getFirstName());
		user.setLastName(bo.getLastName());
		user.setPerEmail(bo.getPerEmail());
		user.setOgrEmail(bo.getOgrEmail());
		return user;

	}

}
