// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 10 - Arrays

// Arrays – the basics

public class Arrays {

	public static void main(String[] args) {

		// there is a big different between value types and reference types,
		// when you type int, you actually mean create enough memory to hold a
		// 32-bit integer
		int value = 7;
		System.out.println(value);
		System.out.println();

		// You can actually create a variable that can refer to a whole list of
		// integers
		// The anatomy is quite different, since values does not actually hold
		// any integers, it just refers to a list of integers
		// It's a reference variable
		int[] values;

		// Here I'm allocating the space for a certain number of values
		values = new int[3];
		// Here we're saying, "point this reference 'values' at the new array of
		// integers, of which I'm going to have [3]

		System.out.println("This was the original value of the array space 0: "
				+ values[0]);
		System.out.println("This was the original value of the array space 1: "
				+ values[1]);
		System.out.println("This was the original value of the array space 2: "
				+ values[2]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		/*
		 * values[3] = 40; // This would cause the program to crash out because
		 * we didn't initialize 4 spaces in the array, only 3
		 */

		System.out.println("This is the new value of the array space 0: "
				+ values[0]);
		System.out.println("This is the new value of the array space 0: "
				+ values[1]);
		System.out.println("This is the new value of the array space 0: "
				+ values[2]);
		
		/*
		 * You can also iterate through the array, which means go through each
		 * value in turn One way to do that is with a "for" loop
		 */

		// In java the size of an array can be found by referring to the .length
		// variable. Each array knows how long it is in Java and the number of
		// values in the array is stored in the .length variable
		// The following statement is saying that:
		// the variable i is set at 0, we want the loop to keep looping until i
		// is one less than the size of the array
		for (int i = 0; i < values.length; i++) {
			System.out.println("The value in array is: " + values[i]);
		}

		// One last thing you can do is to initialize an array while declaring
		// it
		// Here we're creating the array of "number", and telling it to put 5,
		// 6, 7 in it

		int[] numbers = { 5, 6, 7, 8, 9 };

		// Now we're iterating through them, where i is < numbers.length, then
		// adding 1 at each
		for (int i = 0; i < numbers.length; i++) {
			System.out
					.println("The value in the initialed and filled array is: "
							+ numbers[i]);
			
		}

	}

}


