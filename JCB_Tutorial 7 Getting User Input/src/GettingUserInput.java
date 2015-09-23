// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 7 - Getting User Input

/* Getting User Input */
/* You need an input at the top of the file to import the scanner class, must be the first line of the file  */
/* You can read about the Scanner class you can type Scanner Java into Google and you can read the API document */

/* http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

/* If you want to make your program more robust scanner has a method that will enable you to see if there is a next double or a next int and you can use an if statement to get the next line if there is one waiting  */

import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args) {
		
/* Scanner class 
 * input is the variable, but you need a scanner object, represented by new Scanner(System.in) */
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Please enter a line of text: ");
		
/* You are not restricted to just getting lines of text with Scanner, you can enter an integer. For example, instead of String line, you'd use int value = input.nextInt() */
		
		// Wait for the user to enter a line of text		
		String line = input.nextLine();
		
		// Option for integer would look like:
		// int value = input.nextInt();
		
		// Tell the user what they entered		
		System.out.println("You entered: " + line);
		
		// You'd change this to
		// System.out.println("you entered: " + value);
		
		// Should always close everything, Scanner input is not closed in this example
		// close the scanner
		// Obviously you don't have to print out the fact that you're closing the scanner
		       System.out.println();
			   System.out.println("Closing Scanner 'input'...");
			   input.close();
			   System.out.println("Scanner 'input' Closed.");

	}

}
