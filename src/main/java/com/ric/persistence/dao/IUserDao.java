package com.ric.persistence.dao;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ric.persistence.dao.common.IOperations;
import com.ric.persistence.model.User;

public interface IUserDao extends IOperations<User>, UserDetailsService {
	
	//Add required specific methods
	
    boolean authenticate(String uName, String pass) ;
	
	boolean searchByUserName(String uName);
	
	User findByName(String uName);
	
}
