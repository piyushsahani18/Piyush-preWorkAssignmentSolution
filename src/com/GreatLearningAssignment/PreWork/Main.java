package com.GreatLearningAssignment.PreWork;

import java.util.Scanner;

public class Main {
	String inOrder;
	String reverse = "";
	int checkPrime;
	int sum;

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.println("Enter the input to check for Palindrome");

		inOrder = sc.nextLine();
		int inOrderLength = inOrder.length();
		for (int i = inOrderLength - 1; i >= 0; i--)
			reverse = reverse + inOrder.charAt(i);

		if (inOrder.equals(reverse))
			System.out.println("Input is Palindrome");
		else
			System.out.println("Input is Not Palindrome");
	}

	// function to printPattern

	public void printPattern() {
		int starPatternRows;
		System.out.println("Enter the no. of rows needed in the Pattern");
		starPatternRows = sc.nextInt();

		for (int i = starPatternRows; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		int flag = 0;

		System.out.print("Enter the number to check for prime:  ");
		checkPrime = sc.nextInt();
		if (checkPrime == 0 || checkPrime == 1)
			System.out.println(checkPrime + " is a not Prime Number");
		else {
			for (int i = 2; i < checkPrime; i++) {
				if (checkPrime % i == 0) {
					System.out.println(checkPrime + " is a not Prime Number");
					flag = 1;
					break;
				}

			}
		
		if (flag == 0)
				System.out.println(checkPrime + " is a Prime Number");

		}
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.
		System.out.println("Enter the number of elements in the fibonnaci series");
		int noOfElements = sc.nextInt();
		int first = 0, second = 1;
		System.out.print(first + " " + second);
		for (int i = 0; i < noOfElements; i++) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(" " + sum);
		}

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {
            System.out.println();
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
