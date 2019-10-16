//HEADER
//Program Name: Chapter 2 Exercise 3
//Author: Caelen Curtiss
//Class: CS160 Fall 2019
//Date: 10/15/2019
//Description: Printing seconds in the day + manipulating doubles
//and operating on variables

package edu.cgcc.ex3;

public class Time
{

	public static void main(String[] args) 
	{
		//pt. 1
		//Proof program can compile
		//System.out.println("Hello");
		
		//pt. 2
		//Declare and assign variables
		//changed int to double for pt 5.
		double hour = 20.0;
		double minute = 36.0;
		double second = 30.0;
		
		//pt.3
		//Print number of seconds since midnight w/ assigned variables
		System.out.println(hour * 3600 + minute * 60 + second + " seconds since midnight");
	
		//pt. 4
		//print number of seconds remaining in the day
		System.out.println(86400  +-(hour * 3600 + minute * 60 + second) + " seconds 'till midnight");
		
		//pt. 5
		//print % of the that has passed since midnight
		System.out.println((hour * 3600 + minute * 60 + second) * 100 / 86400 + "% of the day elapsed");
		
		//pt. 6
		//new variables for time at the completion of creating this program
		double newHour = 21.0;
		double newMinute = 27.0;
		double newSecond = 45;
		
		//pt. 6
		//Prints time elapsed while working on the program
		System.out.println((newHour * 3600 + newMinute * 60 + newSecond) - 
				(hour * 3600 + minute * 60 + second) + " Time elapsed during project.");
	}
}

/* FOOTER
**74190.0 seconds since midnight
**12210.0 seconds 'till midnight
**85.86805555555556% of the day elapsed
**3075.0 Time elapsed during project.
*/
