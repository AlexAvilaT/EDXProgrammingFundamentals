package com.introduction.app;

public class SumOfNumbers
{

	public static void main(String[] args) 
	{
		//declare the variable
		int sum = 0;
		int number = 1;
		//as long as number is less than 101
		while (number <=100) {
			sum = sum + number; //i want the sum number by number
			number = number + 2;		
		}
		System.out.println("sum of  odd numbers from 1 to 100:"  +  sum);
	}
}


	
