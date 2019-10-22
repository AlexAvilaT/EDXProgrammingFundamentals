package com.introduction.app;

import java.util.Calendar;

public class Car
{

		// instance variables
		String make;
		String model;
		int year;
		boolean isNew;
		double miles;
		String owner;
	
		public static void main(String[] args) 

	{

	Car myCar = new Car();
	
		myCar.make = "Audi";
		myCar.model = "A4";
		myCar.year = 2014;
		myCar.isNew = false;
		myCar.owner = "Alex";
		boolean isMyCarOld = myCar.isOld();
		myCar.sell("Arvind");
		System.out.println("Car Owned by "+myCar.owner);
	}
		//method sell the car to newOwner
		public void sell(String newOwner)
		{
		owner = newOwner;
		if(isNew) {
			isNew = false;
			}
		}
		
	public boolean isOld() {
		int thisYear=
	Calendar.getInstance().get(Calendar.YEAR);
		if(thisYear - year > 10) {
			return true;
		}
		else {
			return false;
		}
	}

}
		
	
	
	
	


