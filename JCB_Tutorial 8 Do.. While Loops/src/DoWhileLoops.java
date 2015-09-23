// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 8 - Do.. While Loops

/* Do... While Loops */

import java.util.Scanner;

public class DoWhileLoops {

/* Asking a user to enter a number and keep entering a number until they enter a specific number. In this case we want them to enter 5 eventually */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
/*	Original code before using the Do.. While loop	
		System.out.println("Enter a number: ");
		
		int value = scanner.nextInt();
		
		while(value != 5) {
			System.out.println("Enter another number: ");
			value = scanner.nextInt();
			// you can only have one "int" value, so you only have to put value = .. instead of int value = 
		}
*/
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			
// You might think you could enter int value = scanner.nextInt();
// But this would cause an error
/* the value only exists inside these brackets, so value can't be checked in the "while" loop 
 * You need to declare it 'outside' the brackets, above the start of the do.. while loop
 * Don't forget - do not put "int" at the beginning of the next value statement */
			
			value = scanner.nextInt();
		
		}

/* Because you're only checking the condition at the end of the loop, there will always be one run through of the loop */

		while(value != 5);
		
		System.out.println("Got 5!");
		
		// Should always close everything, Scanner input is not closed in this example
		// close the scanner
		// Obviously you don't have to print it out
			   System.out.println();
			   System.out.println("Closing Scanner 'scanner'...");
			   scanner.close();
			   System.out.println("Scanner 'scanner' Closed.");

	}

}
