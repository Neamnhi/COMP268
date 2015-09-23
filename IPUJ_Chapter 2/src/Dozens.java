// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Unit 2 #5

public class Dozens {
  
   /*  This program will convert a given number of eggs into
       the number of dozens plus the number of left over eggs.
       For example, 57 eggs is 4 dozen eggs plus 9 eggs left over.
       The number of eggs is input by the user, and the computed
       results are displayed. 
   */

   public static void main(String[] args) {
   
      int eggs;    // Number of eggs, input by user.
      int dozens;  // How many dozens in that number of eggs?
      int extras;  // How many eggs are left over, above an integral
                   //    number of dozens?  This value is in the
                   //    range 0 to 11, and it is computed as
                   //    the remainder when eggs is divided by 12.
   
      TextIO.put("How many eggs do you have?  ");
      eggs = TextIO.getlnInt();
      
      dozens = eggs / 12;
      extras = eggs % 12;
      
      TextIO.put("Your number of eggs is ");
      TextIO.put(dozens);
      TextIO.put(" dozen and ");
      TextIO.put(extras);
      TextIO.putln();
   
   }  // end main()

}  // end class