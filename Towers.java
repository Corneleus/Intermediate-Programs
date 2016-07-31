package IntermediatePrograms;
//----------------------------------------------------------------------
// Towers.java          by Dale/Joyce/Weems                    Chapter 4
//
// Driver class for doTowers method that gets initial values and
// calls the method.
//----------------------------------------------------------------------

import java.util.Scanner;

public class Towers
{
  private static String indent = "";  // indentation for trace 
  private static int count = 0;
  public static void main(String[] args)
  {
    Scanner conIn = new Scanner(System.in);
    

    // Number of rings on starting peg.
    int n;       
    System.out.print("Input the number of rings or enter 0 to exit: ");
    	n = conIn.nextInt();      
    
    while(n > 0){
    	  	
    count = n;
    count = (int) Math.pow(2, count);
    
    System.out.printf("\nTowers program will take %d moves to complete \n",((count - 1)) );
    
    System.out.println("\nTowers of Hanoi with " + n + " rings\n");
    doTowers(n, 1, 2, 3);
    
  	
   	System.out.print("Input the number of rings or enter 0 to exit: ");
   	n = conIn.nextInt();
   	
   	System.out.println("\nTowers of Hanoi with " + n + " rings\n");
    doTowers(n, 1, 2, 3);
   	
    }
    conIn.close(); 
  }
 
  public static void doTowers(
         int n,              // Number of rings to move
         int startPeg,       // Peg containing rings to move
         int auxPeg,         // Peg holding rings temporarily
         int endPeg      )   // Peg receiving rings being moved
  {
    if (n > 0)
    {
      indent = indent + "  ";
      
      System.out.println(indent + "Get " + n + " rings moved from peg " +
         startPeg + " to peg " + endPeg);
      
      // Move n - 1 rings from starting peg to auxiliary peg
      doTowers(n - 1, startPeg, endPeg, auxPeg);

      // Move nth ring from starting peg to ending peg
      System.out.println(indent + "Move ring " + n + " from peg " + startPeg
              + " to peg " + endPeg);
 
      // Move n - 1 rings from auxiliary peg to ending peg
      doTowers(n - 1, auxPeg, startPeg, endPeg);
      
      indent = indent.substring(2);
    }
  }
}
