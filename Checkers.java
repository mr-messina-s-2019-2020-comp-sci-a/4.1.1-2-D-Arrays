
/**
 * Write a description of class Checkers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checkers
{
    public static void main( ) {
        String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < checkerBoard.length; i++) {
            System.out.println("");
            for (int j = 0; j < checkerBoard[0].length; j++) {
               //checks if we're at an odd or even row
               if (i % 2 > 0)
               {
                   //checks if odd or even column 
                   if (j % 2 > 0) 
                   {
                       System.out.print ("\u25a1");
                   }
                   else
                   {
                       System.out.print("\u25a0");
                   }
               }
               else
               {
                   //this if else is for when the row is odd
                   if (j % 2 > 0)
                   {
                       //assigns the spots to black
                       System.out.print("\u25a0");
                   }
                   else
                   {
                       //assigns the spots to white
                       System.out.print("\u25a1");
                   }// Assign "BLACK" or "WHITE" to the appropriate square
               }
           }
    
        }

        
        // Print out the board as 8 rows with either null,
        // "BLACK", or "WHITE" in each element
        // Hint: use both the println and print methods
        // of System.out

    }
}
