package com.fitnesslog;
import java.util.Arrays;
import java.util.Scanner;

public class Project1Draft {
	
	public static String displayListOrdered(String[] names) {
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		
		return Arrays.toString (names);
	}
	
	public static void displayFullNames(String[] names) {
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		for (String name:names) {
			if (name.contains(" ")) {
				System.out.println(name);
			}
		}
		
	}
	
	public static void displaySingleNames(String[] names) {
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		for (String name:names) {
			if (!name.contains(" ")) {
				System.out.println(name);
			}
		}
	}
	
	public static void displayNameStatistics(String[] names) {
		int nameCount = 0;
		int letterCount = 0;
		String firstNoSpaces = names[0].replace(" ", "");
		int lengthShortest = firstNoSpaces.length();
		int lengthLongest = firstNoSpaces.length();
		String shortest = names[0];
		String longest = names[0];
		
		for (String name:names) {
			nameCount++;
			String nameNoSpaces = name.replace(" ", "");
			if (nameNoSpaces.length() > lengthLongest) {
				lengthLongest = nameNoSpaces.length();
				longest = name; 
			}
			
			if (nameNoSpaces.length() < lengthShortest) {
				lengthShortest = nameNoSpaces.length();
				shortest = name;
			}
			
			for (int i=0;i<name.length();i++) {
				char c = name.charAt(i);
				if (Character.isLetter(c) && !Character.isWhitespace(c)) {
					letterCount++;
				}
			}
			
		}
		double avg = letterCount/(double) nameCount;
		double storedVal = 0;
		
		for (String name: names) {
			String nameNoSpaces = name.replace(" ", "");
			int nameNoSpacesL = nameNoSpaces.length();
			double lengthDiff = Math.abs(avg-nameNoSpacesL);
			double squaredDiff = lengthDiff * lengthDiff;
			storedVal += squaredDiff;
		}
		double variance = storedVal / nameCount;
		double stdv = Math.sqrt(variance);
		
		
		
		System.out.println("Name Count: " + nameCount);
		System.out.println("Letter Count Total: " + letterCount);
		System.out.printf("Avg Name Length: %.2f",avg);
		System.out.println();
		System.out.println("Shortest Name: " + shortest);
		System.out.println("Longest Name: " + longest);
		System.out.printf("Population Standard Deviation: %.2f", stdv);
		System.out.println();
	}
	
	public static void displayNamesEven(String[] names) {
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		
		for (String name:names) {
			String nameNoSpaces = name.replace(" ", "");
			if (nameNoSpaces.length() % 2 == 0) {
				System.out.println(name);
			}
		}
	}
	
	public static void displayNamesOdd(String[] names) {
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		
		for (String name:names) {
			String nameNoSpaces = name.replace(" ", "");
			if (nameNoSpaces.length() % 2 == 1) {
				System.out.println(name);
			}
		}
	}
	
	public static void displayNamesNotCapitalized(String[] names) {
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		
		for (String name:names) {
			String[] nameSplitted = name.split(" ");
			for (String nameSplit: nameSplitted) {
				if (Character.isLowerCase(nameSplit.charAt(0))) {
					System.out.println(nameSplit);
				}
			}
			
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scnr = new Scanner(System.in);
		 System.out.println("Enter List of Names Separated by Commas:");
		 String names = scnr.nextLine();
		 System.out.println();
		 String[] namesLst = names.split(",");
		 
		 int userChoice;
		 
		 do {
			
			System.out.println("Please make a selection:");
			System.out.println("1) Display List Ordered");
			System.out.println("2) Display Full Names");
			System.out.println("3) Display Single Names");
			System.out.println("4) Display Name Statistics");
			System.out.println("5) Display Names with Even Length");
			System.out.println("6) Display Names with Odd Length");
			System.out.println("7) Display Names not Capitalized");
			System.out.println("8) Display Most Frequent Name");
			System.out.println("9) Enter new list of Names");
			System.out.println("0) Quit Program");
			
			System.out.println();
			userChoice = scnr.nextInt();

            switch (userChoice) {

                case 0:
                    System.out.println("Exit");
                    break;

                case 1:
                    System.out.println(displayListOrdered(namesLst));
                    System.out.println();
                    break;

                case 2:
                    displayFullNames(namesLst);
                    System.out.println(); 
                    break;

                case 3:
                    displaySingleNames(namesLst);
                    System.out.println();
                    break;

                case 4:
                    displayNameStatistics(namesLst);
                    System.out.println();
                    break;

                case 5:
                    displayNamesEven(namesLst);
                    System.out.println();
                    break;

                case 6:
                    displayNamesOdd(namesLst);
                    System.out.println();
                    break;

                case 7:
                    displayNamesNotCapitalized(namesLst);
                    System.out.println();
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

        } while (userChoice != 0);

	    }

	}

