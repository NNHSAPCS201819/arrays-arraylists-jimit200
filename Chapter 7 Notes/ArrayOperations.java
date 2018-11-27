
/**
 * Write a description of class ArrayOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayOperations
{
    public static void arrayMethod(){
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);
        for(int i =0; i<x.length;i++){
            System.out.println(x[i]);

        }

        int y= 0;
        for(int i =0; i<x.length;i++){
            System.out.print(i+":");   
            System.out.println(x[i]);

        }
        for(int i = x.length-1;i>=0; i--){
            System.out.print((i+1)+":");   
            System.out.println(x[i]);}
        for(double num:x)
        {
        System.out.println(num);
            
        }
    }
}
