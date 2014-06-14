package com.ric.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
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

	@Override
	public boolean authenticate(String uName, String pass) {
		
		boolean valid = false;
		Criteria criteria = getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", uName));
		criteria.add(Restrictions.eq("password", pass));
		List<User> users = criteria.list();
		if(users != null && !users.isEmpty()) {
			valid =  true;
		}
		return valid;
	}

	@Override
	public boolean searchByUserName(String uName) {
		boolean valid = false;
		Criteria criteria = getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", uName));
		List<User> users = criteria.list();
		if(users != null && !users.isEmpty()) {
			valid =  true;
		}
		return valid;
	}
}
