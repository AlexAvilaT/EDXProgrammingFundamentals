package com.introduction.app;
//write a program that gets a single positive integer from the user and checks wether it is prime or not
//import the scanner class
import java.util.*;

public class exercise3 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int userInput = scanner.nextInt();
		
		//System.out.println("the user entered:" + userInput); ->to check the above works correctly
		
		/*prime numbers are divisible by one an itself only
		 * x % y computs reminder when x is divided by y
		 */
		
		int potentialFactor = 2;
		while (userInput % potentialFactor  !=0) 
		{
			potentialFactor++; //increment potentialFactor
		}
		if(potentialFactor == userInput)
		{
			System.out.println("the number is prime:");
		}
		else
		{
			System.out.println("the number is not prime, the factor is = " + potentialFactor);
		}
	}
	

}
