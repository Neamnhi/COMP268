// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Unit 2 #3 Using Scanner

import java.util.Scanner;
// Imports the utility Scanner to be used in the program for inputting the name

public class GreetingSC {

	public static void main(String[] args) {

		Scanner stdin = new Scanner( System.in );
		// There's a problem here, since stdin is never "closed"
	
		String usersName;
		// The user's name, as entered by the user.
		String upperCaseName;
		// The user's name, converted to upper case letters.

		System.out.print("Please enter your name: ");
		usersName = stdin.nextLine();

		upperCaseName = usersName.toUpperCase();

		System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
		
		stdin.close(); // I added this to close stdin to get rid of the "stdin is never closed" error
		
	} // end main()

} // end class
