// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 9 - Switch

/* Switch */

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		/*
		 * allows you to take different actions depending on the value of a
		 * variable, more efficient under some circumstances than the if
		 */

		// Create a scanner object for user input
		Scanner input = new Scanner(System.in);

		// Switch can only be used to check certain types of variables, most
		// common are int and string
		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		// For every value of text that you want to check, you need a case
		// keyword that you want to check for and a colon
		// Then some code that you want to execute

		case "start": // 'case' must be constants, they cannot check variables
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped!");
			break;

		// You can also have a default case, which is optional. Default is
		// executed if none of the other cases are matched
		default:
			System.out.println("Command not recognized!");
			
		// Should always close everything, Scanner input is not closed in this example
		// close the scanner
		// Obviously you don't have to print out the fact that you're closing the scanner
			   System.out.println();
			   System.out.println("Closing Scanner 'input'...");
			   input.close();
			   System.out.println("Scanner 'input' Closed.");

		}

	}

}
