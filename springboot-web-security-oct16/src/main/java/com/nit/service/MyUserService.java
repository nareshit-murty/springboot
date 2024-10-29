package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nit.controller.MyUser;
import com.nit.repository.MyUserRepository;

@Service
public class MyUserService implements UserDetailsService{

	@Autowired
	private MyUserRepository myUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> optUser =  myUserRepository.findByUsername(username);
		if (optUser.isPresent()) return optUser.get();
		throw new UsernameNotFoundException("User is not found!!");
	}

}
