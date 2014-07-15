package com.ric.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ric.persistence.dao.IUserDao;
import com.ric.persistence.dao.common.RicAbstractDAO;
import com.ric.persistence.model.User;
import com.ric.web.model.SecurityUser;
import com.ric.web.model.UserBO;

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
	@Transactional
	public User findByName(String uName) {

		User user = null;
		try {
			Criteria criteria = getCurrentSession().createCriteria(User.class);
			criteria.add(Restrictions.eq("userName", uName));
			user = (User) criteria.uniqueResult();
		} catch (Exception ex) {
			System.out.println("exception " + ex.getMessage());
		}

		return user;
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		SecurityUser securityUser;
		final User user = findByName(username);
		System.out.println(user);

		if (!user.getUserName().equalsIgnoreCase(username)) {
			throw new UsernameNotFoundException(username + " not found");
		} else {

			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("USER"));

			securityUser = new SecurityUser(username, user.getPassword(), true,
					true, true, true, authorities, user.getFirstName(),
					user.getLastName(), user.getPerEmail(), user.getOgrEmail());
			System.out.println("security userdetails "
					+ securityUser.getPerEmail());

			return securityUser;
		}
	}

}
