//HEADER
//Program Name: Chapter 2 Exercise 2
//Author: Caelen Curtiss
//Class: CS160 Fall 2019
//Date: 10/15/2019
//Description: Printing String and int variables as the date


	package edu.cgcc.ex2;

	public class Date
{
		
	public static void main(String[] args)
	{
		//Pt. 1
		//Test for proper compilation
		//System.out.println("Hello, World!");	
		
		//Pt. 2 & 3
		//Variables and print lines individually
		
		/*
		 String day;
		day = "Tuesday";
		int month = 10;
		String date;
		date = "15th";
		int year = 2019;

		System.out.println(day);
		System.out.println(month);
		System.out.println(date);
		System.out.println(year);
		*/
		
		
		//pt. 4 
		//Print American date format
		
		String day;
		String month;
		day = "Tuesday";
		month = "October";
		int year = 2019;
		int date = 15;
		
		System.out.print(day + ", ");
		System.out.print(month + " ");
		System.out.print(date + ", ");
		System.out.println(year);
		
	
		//pt. 5
		//Print European date format
		System.out.print(day + " ");
		System.out.print(date + " ");
		System.out.print(month + " ");
		System.out.println(year);
	
	}

}

/* FOOTER
**Tuesday, October 15, 2019
**Tuesday 15 October 2019
*/
