package com.learningstudent.spring.basics.learningspringforvalues;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSort implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
