package com.ric.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.ric.persistence.dao.IUserDao;
import com.ric.persistence.dao.common.RicAbstractDAO;
import com.ric.persistence.model.User;

@Repository
public class UserDao extends RicAbstractDAO<User> implements IUserDao {

	public UserDao() {
        super();
        setClazz(User.class);
    }
}
