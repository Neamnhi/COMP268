// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Unit 2 #4 Using Scanner

import java.util.Scanner;

public class CountChangeSC {
	
	public static void main(String[] args) {

	   int quarters;   // Number of quarters, to be input by the user.
	   int dimes;      // Number of dimes, to be input by the user.
	   int nickels;    // Number of nickels, to be input by the user.
	   int pennies;    // Number of pennies, to be input by the user.

	   Scanner stdio = new Scanner( System.in );
	   // There's a problem here, since stdin is never "closed"
	   
	   double dollars; // Total value of all the coins, in dollars.

	   /* Ask the user for the number of each type of coin. */

	   System.out.print("Enter the number of quarters: ");
	   quarters = stdio.nextInt();
	   stdio.nextLine();

	   System.out.print("Enter the number of dimes: ");
	   dimes = stdio.nextInt();
	   stdio.nextLine();
	   
	   System.out.print("Enter the number of nickels: ");
	   nickels = stdio.nextInt();
	   stdio.nextLine();
	   
	   System.out.print("Enter the number of pennies: ");
	   pennies = stdio.nextInt();
	   stdio.nextLine();
	   
	   /* Add up the values of the coins, in dollars. */
	   
	   dollars = (0.25 * quarters) + (0.10 * dimes) 
			   + (0.05 * nickels) + (0.01 * pennies); 
	   /* Report the result back to the user. */
	   
	   System.out.println();
	   System.out.print("The total in dollars is $");
	   System.out.printf("%1.2f", dollars);  // Formatted output!
	   System.out.println();
	   
	   stdio.close(); // I added this to close stdio to get rid of the "stdio is never closed" error
	   
   }  // end main()
   
}  // end class