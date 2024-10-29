package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nit.repository.AppUserRepository;

@Service
public class AppUserService  implements UserDetailsService{

	@Autowired
	private AppUserRepository appUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return appUserRepository.findByEmail(username).get();
	}

}
