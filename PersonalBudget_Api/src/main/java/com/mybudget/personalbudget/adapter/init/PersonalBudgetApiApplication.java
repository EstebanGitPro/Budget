package com.mybudget.personalbudget.adapter.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mybudget.personalbudget" })
@EnableJpaRepositories(basePackages = { "com.mybudget.personalbudget" })
@EntityScan(basePackages = { "com.mybudget.personalbudget" })

public class PersonalBudgetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalBudgetApiApplication.class, args);
	}

}
