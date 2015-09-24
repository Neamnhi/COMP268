// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 6 - If statements

/* If statements */
public class IfTutorial {

/* We've already seen conditional statements such as boolean, which has greater than, less than, or not equal to (!=) or equal to (==) 
 * A single equal sign means you're assigning something, to test for a quality you need 2 of them, assigning equality and testing equality */
	
	public static void main(String[] args) { /* main method out */
		
		int myInt = 15;
		
/* Usually you want to take an action if something is true and a different action if something is false
 * 
 *  */
 
		if(myInt < 10) {
/* condition is false so it wouldn't do the code, but if you add an else statement, something else will happen. There is also the ability to do "else if" */
 
			System.out.println("Yes, it's true!");
		}
		
		else if (myInt > 20){
			System.out.println("No, it's false!");
		}
/* If you set it so that the "if" and the "else if" are both true, it'll only process the first one */

		else {
			System.out.println("None of the above.");
/* It will do this if none of the other conditions are true */
		}
	}

}
