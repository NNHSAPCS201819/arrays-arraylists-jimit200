import java.util.Scanner;
/**
 * Write a description of class MagicSquares here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquares
{
    public static void testIfMagicSquare(){
        Scanner s = new Scanner(System.in);
        System.out.print("number of squares: ");
        int square = s.nextInt();
        int[][] matrix = new int[(int)Math.sqrt(square)][(int)Math.sqrt(square)];
        System.out.print("start entering numbers for each row at a time: ");
        for (int i = 0; i<(int)Math.sqrt(square);i++)
        {
            for (int j = 0; i<(int)Math.sqrt(square);j++)
            {
                int num = s.nextInt();  
                matrix[i][j]=s.nextInt();
            }
        
        
        }
        System.out.print("done");
        
    }
}
