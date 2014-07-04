package com.ric.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.ric.persistence.dao.IUserDao;
import com.ric.persistence.dao.common.RicAbstractDAO;
import com.ric.persistence.model.User;

@Repository
public class UserDao extends RicAbstractDAO<User> implements IUserDao,UserDetailsService {

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
		if (users != null && !users.isEmpty()) {
			valid = true;
		}
		return valid;
	}

	@Override
	public boolean searchByUserName(String uName) {
		boolean valid = false;
		Criteria criteria = getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", uName));
		List<User> users = criteria.list();

		if (users != null && !users.isEmpty()) {
			valid = true;
		}
		return valid;
	}

	@Override
	public User findByName(String uName) {
		Criteria criteria = getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", uName));
		User user= (User) criteria.uniqueResult();
		return user;
	}
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		/*final User user = findByName(username);
		
*/
		if (!username.equalsIgnoreCase(username)) {
			throw new UsernameNotFoundException(username + " not found");
		} else {

			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("USER"));

			org.springframework.security.core.userdetails.User securityUser = new org.springframework.security.core.userdetails.User(
					"Siva", "Siva123", true, true, true,
					true, authorities);
			return securityUser;
		}
	}
	
	

}
