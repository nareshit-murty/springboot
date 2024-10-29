package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootTransactionSep11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionSep11Application.class, args);
	}

}
