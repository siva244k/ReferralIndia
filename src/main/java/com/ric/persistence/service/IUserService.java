package com.ric.persistence.service;

import com.ric.persistence.dao.common.IOperations;
import com.ric.persistence.model.User;

public interface IUserService extends IOperations<User> {

	// Add specific methods

	boolean authenticate(String uName, String pass);

	boolean searchByUserName(String uName);

	User findByName(String uName);

}
