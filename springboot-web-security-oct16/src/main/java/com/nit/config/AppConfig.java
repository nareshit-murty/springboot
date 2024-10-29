package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.nit.service.MyUserService;

@Configuration
public class AppConfig {

	@Autowired
	private MyUserService service;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	/*
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.builder().username("pranay").password(passwordEncoder().encode("welcome1"))
				.roles("ADMIN").build();
		UserDetails user2 = User.builder().username("krishna").password(passwordEncoder().encode("welcome2"))
				.roles("USER").build();
		return new InMemoryUserDetailsManager(user1, user2);
	}
	*/
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(service);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(authorize -> {
			authorize.requestMatchers("/murty","/").permitAll();
			authorize.anyRequest().authenticated();
		})
		//.formLogin(Customizer.withDefaults());
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	
	
}
