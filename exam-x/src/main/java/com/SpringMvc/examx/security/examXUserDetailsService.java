package com.SpringMvc.examx.security;

import com.SpringMvc.examx.entity.User;
import com.SpringMvc.examx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class examXUserDetailsService implements UserDetailsService {


	@Autowired
	private UserService service;

	@Override

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


//		User user=service.findById()
User user =service.findByEmail( email);

		if (user != null) {

			return new examXUserDetails(user);
		}

		throw new UsernameNotFoundException("Böyle bir kullanıcı bulunamadi : " + email);

	}
}
