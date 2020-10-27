package com.learningstudent.restwebservice.learingrestframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.store.users.UserResource;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserResource.class)
public class LearingrestframeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearingrestframeworkApplication.class, args);
	}

}
