
/**
 * Write a description of class checkers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class checkers
{
  public static void main( ) {
        String[][] checkerBoard = new String[8][8];
        int rows = checkerBoard.length;  // number of rows - the outer array
        int cols = checkerBoard[0].length; // number of columns - the inner array
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                checkerBoard[i][j] = "Black";
            }
       }
       
       for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0) {
                   if (j % 2 == 0 ) {
                    checkerBoard[i][j] = "White";
                }
            }
            if (i % 2 == 1) {
               if (j % 2 == 1) {
                checkerBoard[i][j] = "White";
                  } 
                }
            }
       }
       
        for (int i = 0; i < rows; i++) {
            System.out.println(" ");
            for (int j = 0; j < cols; j++) {
         System.out.print(checkerBoard[i][j]  + "\t");
        }
      }
    }
}     

