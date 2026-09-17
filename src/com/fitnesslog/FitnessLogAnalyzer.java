package com.fitnesslog;

import java.util.Scanner;

public class FitnessLogAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter exercises separated by commas:");
		String exercises = scnr.nextLine(); //this will read the input of the user 
		
		String[] exercisesLst = exercises.split(",");
//		python example on how split works: 
//		"hello world".split() # Output: ['hello', 'world'] SPLITTING BY WHITESPACE
//		"apple,banana,cherry".split(",") # Output: ['apple', 'banana', 'cherry'] SPLITTING BY COMA
		
		for (int i=0; i<exercisesLst.length; i++) {
//			exercisesLst.length gives out the length count of the items in the array
			exercisesLst[i] = exercisesLst[i].trim();
			System.out.println(exercisesLst[i]);
			
		}
		
		
		
		

	}

}
