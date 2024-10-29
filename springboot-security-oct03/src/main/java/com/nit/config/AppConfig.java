package com.nit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@PropertySource("users.properties")
public class AppConfig {

	@Value("${first.user.name}")
	private String firstUserName;
	
	@Value("${first.user.password}")
	private String firstUserPassword;
	
	@Value("${first.user.role}")
	private String firstUserRole;
	
	@Value("${second.user.name}")
	private String secondUserName;
	
	@Value("${second.user.password}")
	private String secondUserPassword;
	
	@Value("${second.user.role}")
	private String secondUserRole;
	
	@Value("${third.user.name}")
	private String thirdUserName;
	
	@Value("${third.user.password}")
	private String thirdUserPassword;
	
	@Value("${third.user.role}")
	private String thirdUserRole;
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		UserDetails admin = User.builder()
				.username(firstUserName)
				.password(encoder.encode(firstUserPassword))
				.roles(firstUserRole)
				.build();
		UserDetails user = User.builder()
				.username(secondUserName)
				.password(encoder.encode(secondUserPassword))
				.roles(secondUserRole)
				.build();
		UserDetails accountant = User.builder()
				.username(thirdUserName)
				.password(encoder.encode(thirdUserPassword))
				.roles(thirdUserRole)
				.build();
		return new InMemoryUserDetailsManager(admin,user,accountant);
	}
}
