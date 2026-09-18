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
//			.trim() cuts off blank space (spaces, tabs) that's hanging 
//			off the front or back edges of a string
//			"  hello  ".trim()   →  "hello"        (front and back spaces gone)
//			"hello world".trim() →  "hello world"  (middle space stays — nothing to trim)
//			" squats".trim()     →  "squats"
//			"squats ".trim()     →  "squats"
			//we use this because if you watch carefully, the user inputs Strings with spaces
			//  squats, deadlift. The trim is used to cut off those spaces
			
			System.out.println(exercisesLst[i]);
			
		}
		
		int choice;
		
		do {
			
			System.out.println("1) Display List Ordered");
			System.out.println("2) Display Full Names");
			System.out.println("3) Display Single Names");
			System.out.println("4) Display Exercise Statistics");
			System.out.println("5) Display Exercises with Even Length");
			System.out.println("6) Display Exercises with Odd Length");
			System.out.println("7) Display Exercises not Capitalized");
			System.out.println("8) Display Most Frequent Exercise");
			System.out.println("9) Enter new list of Exercises");
			System.out.println("0) Quit Program");
			
			choice = scnr.nextInt();
			
			switch (choice) {
			
				case 0:
					System.out.println("Program Exiting");
					break;
				
				case 1:
					System.out.println("-");
					break;
			
				case 2:
					System.out.println("-");
					break;
				
				case 3:
					System.out.println("-");
					break;
				
				case 4:
					System.out.println("-");
					break;
					
				case 5:
					System.out.println("-");
					break;
				
				case 6:
					System.out.println("-");
					break;

				case 7:
					System.out.println("-");
					break;
					
				case 8:
					System.out.println("-");
					break;
					
				case 9:
					System.out.println("-");
					break;
					
				default:
					System.out.println("Invalid Input");
			}
		} while (choice != 0);
		
		
		
		

	}

}
