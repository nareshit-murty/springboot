package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootThymeleafEmployeeSep30Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafEmployeeSep30Application.class, args);
	}

}
