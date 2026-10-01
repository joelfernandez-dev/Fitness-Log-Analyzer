package com.fitnesslog;

import java.util.Scanner;
import java.util.Arrays;

public class FitnessLogAnalyzer {
	
	
	public static String displayListOrdered(String[] exercises) {
		Arrays.sort(exercises,String.CASE_INSENSITIVE_ORDER);
		//.CASE_INSENSITIVE_ORDER builds the sort without taking into account if 
		//its uppercase or lower case. By using this, the order goes something  like:
		//A,a,b,B,c,C.....etc
		
		return Arrays.toString(exercises);
		//Arrays.toString example of usage:
//		String[] fruits = {"apple", "banana", "orange"};
//		System.out.println(Arrays.toString(fruits));
//		Output = [apple, banana, orange]
			
		}
	
	public static void displayFullExercises(String[] exercises) {
////		String result = "";
////		for (String exercise: exercises) {
////			if (exercise.contains(" ")) {
////				result += exercise + "\n"; 
////			}
////		}
////		return result;
//		StringBuilder result = new StringBuilder();
//		boolean first = true;
//		
//		for (String exercise:exercises) {
//			if (exercise.contains(" ")) {
//				if (!first) { //if different than true, do: add a new line
//					result.append("\n");
//				}
//				result.append(exercise);
//				first = false; 
//			//after we get the last one, it does go into the new line conditional because
//			//there are no more words to loop through so that's why a new line is not
//			//printed at the end.
//			}
//		}}
//		return result.toString();
		//StringBuilder is an object, when we use .toString, we are making the object 
		//into a string 
		for (String exercise: exercises) {
			if (exercise.contains(" ")) {
				System.out.println(exercise);
			}
		}
	}
	
	public static void displaySingleExercises(String[] exercises) {
//		String result = "";
//		for (String exercise: exercises) {
//			if (!exercise.contains(" ")) {    ////THIS IS O(N^2) time complexity, we want O(N)
//				result += exercise + "\n"; 
//			}
//		}
//		return result;
		
//		StringBuilder result = new StringBuilder();
//		boolean first = true;
//		
//		for (String exercise:exercises) {
//			if (!exercise.contains(" ")) {
//				if (!first) {
//					result.append("\n");
//				}
//				
//				result.append(exercise);
//				first = false;
//			}
//		}
//		return result.toString();
		for (String exercise: exercises) {
			if (!exercise.contains(" ")) {
				System.out.println(exercise);
			}
		}
		
	}
	
	public static void displayEvenLengthExercises(String[] exercises) {
		for (String exercise:exercises) {
			String result = exercise.replace(" ", "");
			if (result.length() % 2 == 0) {
				System.out.println(exercise);
			}
		}
	}
	
	public static void displayOddLengthExercises(String[] exercises) {
		for (String exercise:exercises) {
			String result = exercise.replace(" ", "");
			if (result.length() % 2 == 1) {
				System.out.println(exercise);
			}
		}
	}
	
	public static void displayNotCapitalizedExercises(String[] exercises) {
		for (String exercise:exercises) {
			String[] newExercises = exercise.split(" ");
			//SPLIT ON WHITESPACES
			for (String newExercise: newExercises) {
				if (!Character.isUpperCase(newExercise.charAt(0))) {
					System.out.println(newExercise);
				}
			}
		}
	}
	
	
	public static void displayNameStatistics(String[] exercises) {
		int nameCount = 0;
		int letterCount = 0;
		String wordNoSpaces = exercises[0].replace(" ", "");
		int longest = wordNoSpaces.length();
		int shortest = wordNoSpaces.length();
		String longestSoFar = exercises[0];
		String lowestSoFar = exercises[0];
		
		for (String exercise:exercises) {
			nameCount++;
			String exerciseNoSpaces = exercise.replace(" ","");
			if (exerciseNoSpaces.length() > longest) {
				longest = exerciseNoSpaces.length();
				longestSoFar = exercise;
			}
			if (exerciseNoSpaces.length() < shortest) {
				shortest = exerciseNoSpaces.length();
				lowestSoFar = exercise;
			}
			//String result = exercise.replace(" ", ""); //replaces the spaces, so the words
			//can be together: pullups,etc
			for (int i = 0; i<exercise.length(); i++) {
				char c = exercise.charAt(i);
				
				if (Character.isLetter(c)) {
					letterCount++;
				}
			}
		}
		double mean = letterCount/(double)nameCount;
		double storedVal = 0;
		
		for (String exercise:exercises) {
			String exerciseNoSpaces = exercise.replace(" ", "");
			int exerciseNoSpacesL = exerciseNoSpaces.length();
			double lengthDiff = Math.abs(mean - exerciseNoSpacesL);
			double squaredDiff = lengthDiff * lengthDiff;
			storedVal += squaredDiff;
		}
		double variance = storedVal / nameCount; 
		double stdv = Math.sqrt(variance);
		
		
		System.out.println("Name Count: " + nameCount);
		System.out.println("Letter Count Total: " + letterCount);
		System.out.printf("Avg Name Length: %.2f", mean);
		//you have to use printf when using .2f and cannot use "+"
		System.out.println();
		System.out.println("Shortest Name: " + lowestSoFar);
		System.out.println("Longest Name: " + longestSoFar);
		System.out.printf("Population Standard Deviation: %.2f", stdv);
		System.out.println();
}
	
	public static void displayMostFrequentExercise(String[] exercises) {
		String mostFrequentSoFar = exercises[0];
		int bestCountSoFar = 0;
		
		for (int i = 0; i<exercises.length;i++) {
			int maxCount = 0;
			
			for (int j=0; j<exercises.length;j++) {
				if (exercises[i].equalsIgnoreCase(exercises[j])) {
					maxCount++;
					
				}
			}
			if (maxCount > bestCountSoFar) {
				bestCountSoFar = maxCount;
				mostFrequentSoFar = exercises[i];
			}
		}
		if (bestCountSoFar == 1) {
			System.out.println("No Most Frequent Exercise");
		}
		else {
			System.out.println("Most Frequent Exercise: " + mostFrequentSoFar);
		}
	}
	
	public static String[] readExerciseList(Scanner scnr) {
		System.out.println("Enter exercises separated by commas:");
		String exercises = scnr.nextLine(); //this will read the input of the user 
		
		String[] exercisesLst = exercises.split(",");
		//ITS LIKE SAYING: "SPLIT ON COMMAS"
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
//			
//			System.out.println(exercisesLst[i]);
//			
		}
		return exercisesLst;
		
	}
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String[] exercisesLst = readExerciseList(scnr); //passes the scanner established by us
		
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
			scnr.nextLine();
			
			switch (choice) {
			
				case 0:
					System.out.println("Program Exiting");
					break;
				
				case 1:
					System.out.println(displayListOrdered(exercisesLst));
					break;
			
				case 2:
					displayFullExercises(exercisesLst);
					break;
				
				case 3:
					displaySingleExercises(exercisesLst);
					break;
				
				case 4:
					displayNameStatistics(exercisesLst);
					break;
					
				case 5:
					displayEvenLengthExercises(exercisesLst);
					break;
				
				case 6:
					displayOddLengthExercises(exercisesLst);
					break;

				case 7:
					displayNotCapitalizedExercises(exercisesLst);
					break;
					
				case 8:
					displayMostFrequentExercise(exercisesLst);
					break;
					
				case 9:
					exercisesLst = readExerciseList(scnr);
					break;
					
				default:
					System.out.println("Invalid Input");
			}
		} while (choice != 0);
		
		
		
		

	}

}
