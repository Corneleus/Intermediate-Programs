package IntermediatePrograms;
//----------------------------------------------------------------------
// BlobApp.java          by Dale/Joyce/Weems                   Chapter 4
//
// Instantiates a Grid based on a percentage probability provided by the 
// user and reports the number of blobs in the Grid.
//----------------------------------------------------------------------
/*
 * 4.16 Question
 * as the % of blob increases the blobs also become attached and then there is larger blobs
 * but fewer of them the empty space is what is causing lots of blobs at 100% there is no
 * space
 * 
 * Tests
 * 10	35,33,39 	
 * 15	40,50,49
 * 20	50,50,51
 * 25	59,57,53
 * 27	61,63,48
 * 30	51,57,57
 * 40	49,53,50
 * 50	29,35,45
 * 60	20,9
 * 70	
 * 80	
 * 90	
 * 100	
 * 
 * around 27 gives the highest blob amount and decreases sharply at around 50
 * 
 * 
 * 
 */




import java.util.Scanner;
//uses grid.java


public class BlobApp
{
  public static void main(String[] args)
  {
    Scanner conIn = new Scanner(System.in);

    final int GRIDR = 10;   // number of grid rows
    final int GRIDC = 40;   // number of grid columns

    // Get percentage probability of blob characters
    int percentage;       
    System.out.print("Input percentage probability (0 to 100): ");
    if (conIn.hasNextInt())
      percentage = conIn.nextInt();
    else
    {
      System.out.println("Error: you must enter an integer.");
      System.out.println("Terminating program.");
      conIn.close();
      return;
      
    }
    System.out.println();

    // create grid
    Grid grid = new Grid(GRIDR, GRIDC, percentage);
    
    // display grid and blob count
    System.out.println(grid);
    System.out.println("\nThere are " + grid.blobCount() + " blobs.\n");
    conIn.close();
  }
}
