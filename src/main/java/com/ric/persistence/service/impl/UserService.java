package com.ric.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ric.persistence.dao.IUserDao;
import com.ric.persistence.dao.common.IOperations;
import com.ric.persistence.model.User;
import com.ric.persistence.service.IUserService;
import com.ric.persistence.service.common.RicAbstractService;

@Service
public class UserService extends RicAbstractService<User> implements IUserService {

	@Autowired
    private IUserDao dao;

    public UserService() {
        super();
    }

    @Override
    protected IOperations<User> getDao() {
        return dao;
    }

	@Override
	public boolean authenticate(String uName, String pass) {
		
		return dao.authenticate(uName, pass);
		
	}

	@Override
	public boolean searchByUserName(String uName) {
		return dao.searchByUserName(uName);
	}
    
    // API
}
