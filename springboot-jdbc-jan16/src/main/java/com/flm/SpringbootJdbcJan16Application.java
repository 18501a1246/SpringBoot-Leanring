package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootJdbcJan16Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcJan16Application.class, args);
	}

}
