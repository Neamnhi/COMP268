// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

//Blue Pelican Lesson 2

public class HelloWorld {
	
	public static void main(String args[])
	{
		System.out.println("Hello World!");
		System.out.println();
		
		String s = "Hello cruel world";
			// Strings are used to store things in quotes
			// Declares the string variable s as = "Hello cruel world"
		System.out.println("The value of String 's' is " + s);
		System.out.println(); //blank line
		
		int age = 45;
			// int is used to store positive or negative integers
			// age is declared as 45
			// int has a maximum value of 2,147,483,647
		System.out.println("The value of int 'age' is " + age);
		System.out.println();
		
		int bigNumA = 1000123000;
			// Can also be entered as follows:
		int bigNumB = 1_000_456_000;
			// Using underscores instead of commas
		System.out.println("The value of bigNumA is " + bigNumA);
		System.out.println("The value of bigNumB is " + bigNumB);
		System.out.println();
		
		double d = -137.8036;
			// double is used to store floating point numbers such as decimal fractions
			// double means "double precision"
		System.out.println("The value of double 'd' is " + d);
		System.out.println();
		
		double e = 1.45667E23; //Scientific notation meaning 1.45667 x 10 to the power of 23
		System.out.println("The value of double 'e', which was entered in scientific notation format is " + e);
		System.out.println();
		
		//This can also be done by separate declarations:
		
		double x; // Declares x to be of type double
		x = 1.6; // This initializes x to a value of 1.6
		System.out.println("The value of double 'x' is " + x);
		System.out.println();
		
	} // Closes main

} // closes class
