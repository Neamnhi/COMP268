// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 4 - While Loops

public class WhileLoops {

	public static void main(String[] args) {
		
/* In the first tutorial we saw the boolean type which could be used to store a true or false value.
 * You can also store a function, such as "boolean loop = 4 < 5" to output "true" or "false" as well.
 * You can also use a variable to perform the same type of function 
 * For example: int value = 10, boolean loop = value < 20, you'd get true
 * You do something similar for "while" loops. As long as the condition used in the while loop is true, the loop will run*/
		
		int value = 0;
		System.out.println("The starting value is " + value);

/* while is the keyword, (value < 10) is the condition, once the condition is no longer true, the loop should stop */
		while(value < 10) {
			System.out.println("Hello " + value);
			
/* By doing value = value + 1, the loop will stop when the value equals 10, because the condition is no longer true */			
			value = value + 1;
		}

	}

}
