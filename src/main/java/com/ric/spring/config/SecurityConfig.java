package com.ric.spring.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.ric.persistence.dao.IUserDao;

@Configuration
@EnableWebSecurity
@ComponentScan("com.ric")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	static final Logger log = LoggerFactory.getLogger(SecurityConfig.class);

	@Autowired
	private IUserDao dao;

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {

		// using custom UserDetailsService DAO
		// auth.userDetailsService(new CustomUserDetails());
		auth.userDetailsService(dao);

	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
		// Spring Security should completely ignore URLs ending with .html
				.antMatchers("/*.html");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/resources/**")
				.permitAll().anyRequest().authenticated().and().formLogin()
				.loginPage("/login").defaultSuccessUrl("/loginSucces").permitAll().and()
				.rememberMe().and().logout().permitAll();
	}

}
