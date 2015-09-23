// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 1 and 2 - Hello World and Primitive Variables

/* This has to be in everything, you must always declare a public class */
public class Application {  

/* This has to be in everything, you must always declare a main as well */
	public static void main(String[] args) {  
		
/* Declaring variables
 * Variables are like boxes that you can put values in. There are different types of boxes in Java, which can hold different types/kinds/sizes of things */
		
		
/* int = integer, this box can hold a whole number, negative or positive. 32-bit value in Java  */
		int myNumber;
/* This initializes the variable. Initializing the variable can be done in two steps, shown here, or in one step shown below */
		myNumber = 88; 
		
/* short = A 16-bit value, holds smaller numbers */		
		short myShort = 847; 
/* long = for really long numbers, 64-bit value */
		long myLong = 999999999; 
		
/* Floating point number (extra precision), long decimal numbers */
		double myDouble = 7.3243; 
/* Short version of double, must have the "f" after the number otherwise it defaults to being a double. Less commonly used. */
		float myFloat = 324.3f; 
		
/* Holds a single unicode character. Specify the character by putting it in single quotes 16-bit */
		char myChar = 'y'; 
/* Value is true or false. */
		boolean myBoolean = true; 
		
/* Holds 8-bits of data, positive or negative number, goes from -128 to 127 */
		byte myByte = -128; 
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);

	}
}
