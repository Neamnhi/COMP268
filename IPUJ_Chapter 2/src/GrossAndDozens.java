// Author: Carol Ann Wilson
// Student ID: 2719606
// Course: COMP268
// Date created: Sept. 23, 2015

// Unit 2 #5
// Improved version of Dozens

public class GrossAndDozens {
  
   /*  This program will convert a given number of eggs into
       the number of gross plus the number of dozens plus the
       number of left over eggs.
       For example, 1342 eggs is 9 gross plus 3 dozen plus 10.
       The number of eggs is input by the user, and the computed
       results are displayed. 
   */

   public static void main(String[] args) {
   
      int eggs;         // Number of eggs, input by user.
      int gross;        // How many gross in that number of eggs?
      int aboveGross;   // How many eggs are left over, above an
                        //    integral number of gross?  This number
                        //    can be computed as eggs % 144, and is
                        //    in the range 0 to 143.  This number will
                        //    be divided into dozens and extras.
      int dozens;       // How many dozens in aboveGross?
      int extras;       // How many eggs are left over, above integral
                        //    numbers of gross and dozens? 
   
      TextIO.put("How many eggs do you have?  ");
      eggs = TextIO.getlnInt();
      
      gross = eggs / 144;
      aboveGross = eggs % 144;
      
      dozens = aboveGross / 12;
      extras = aboveGross % 12;          
      
      TextIO.put("Your number of eggs is ");
      TextIO.put(gross);
      TextIO.put(" gross, ");
      TextIO.put(dozens);
      TextIO.put(" dozen, and ");
      TextIO.put(extras);
      TextIO.putln();
   
   }  // end main()

}  // end class