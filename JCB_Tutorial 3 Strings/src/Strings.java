// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Java for Complete Beginners
// by Cave of Programming
// https://www.youtube.com/playlist?list=PL9DF6E4B45C36D411

// Tutorial 3 - Strings

/* Strings */

public class Strings {

/* Every program must have the main method */
	public static void main(String[] args) {
		
/* Similar to the primitive type variables (numbers) you can create a string type, which holds text. However unlike primitive types, you use String (upper case) because it's a class */
		int myInt = 7;
		String text = "Hello";
/* String is a class of object, similar to the same way a cat is a type of animal. A string is a type of object that can hold text. 
 * Class - String
 * Instance of the class - "Hello"
 * */
		System.out.println(text);
/* Strings can be added together */
		
		String blank = " ";
		String name = "Bob";
		String greeting = text + blank + name;
		
		System.out.println(greeting);
		
/* You can add string objects together directly */
		System.out.println("Hello there" + " " + "Bob");

/* You can also concatenate strings and primitive types */
		System.out.println("My integer is: " + myInt);
		
/* You can put a variable in the middle of a string as well (Don't forget your variable name ;) ) */
		double myDouble = 7.8;
		System.out.println("My number is: " + myDouble + "!");
		
	}
}
