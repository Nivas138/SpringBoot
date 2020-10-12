package com.learningstudent.spring.basics.learningspringforvalues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImplementation {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImplementation(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	//Binary Search & Inputs
   public boolean binarySearch(int[] numbers,int search) {
	   int[] numbers1 = sortAlgorithm.sort(numbers);
	   System.out.println(sortAlgorithm);
	   if(sortAlgorithm.toString().contains("Bubble")) {
		   return true;
	   }else {
		   return false;
	   }
   }
}
