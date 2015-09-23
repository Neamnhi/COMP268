// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 5 - For Loops

/* For Loops */

public class ForLoops {

	public static void main(String[] args) {

/* For Loops
 * For loops require at least 2 semicolons inside the round brackets
 * The semicolons divide it into 3 sections.
 * The first section contains code that executes before the loop starts
 * The second clause contains a condition.. as long as the condition is true, the loop will execute 
 * The third clause is a condition that will be executed once after every iteration of the loop
 * 
 *  A shorthand way of increasing I by one is i++ 
 *  
 *  */
		for(int i=0; i < 10; i = i + 1) {
			System.out.println("Hello world, this is a for loop. The value of the int is now " + i);

/* There's another way of printing out the value of i is to use a method of of printf instead of println
 * To do this you have to pass two arguments to this method
 * The first argument is a string/format specifier and the second argument is a value to fill in the format specifier
 * A format specifier is a string that can contain special characters/symbols that will then be replace by the variable
 * Format specifiers begin with % and end with a letter, for an integer you would use %d
 * This means "print this string, but replace %d with the value of the integer presented after the comma
 * printf does not print each iteration on a new line, an easy way to add a new line is to add a blank sysoutprintln, or you can type another special character sequence of \n which means new line  */
			
			System.out.printf("The value of i is: %d\n", i);
			System.out.println("This loop will continue as long as i is less than 10.");
	
		}
		
	}

}
