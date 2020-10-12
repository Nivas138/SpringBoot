package com.learningstudent.spring.basics.learningspringforvalues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningspringforvaluesApplication {

	public static void main(String[] args) {
		//BinarySearchImplementation binarySearchImplementation = new BinarySearchImplementation(new QuickSort());
		//boolean results = binarySearchImplementation.binarySearch(new int[] {1,2,6,7}, 4);
	
		ApplicationContext applicationContext = SpringApplication.run(LearningspringforvaluesApplication.class, args);
		BinarySearchImplementation binarySearchImplementation = applicationContext.getBean(BinarySearchImplementation.class);
		boolean results = binarySearchImplementation.binarySearch(new int[] {1,2,6,7}, 4);
		if(results) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
	}

}
