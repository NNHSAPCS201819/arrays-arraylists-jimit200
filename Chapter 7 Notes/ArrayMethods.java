import java.util.Arrays;

public class ArrayMethods
{
   private int[] values;
   public ArrayMethods(int[] initialValues)
   {
      this.values = initialValues;
   }
   public void printArray()
   {
      System.out.println(Arrays.toString(this.values));
   }
   public void swapFirstAndLast()
   {
      int first = values[0];
      values[0]=values[values.length-1];
      
      values[values.length-1]= first;
   }
   public void shiftRight()
   {
    int last=values[values.length-1];
    for(int i = 1 ; i< values.length;i++){
    values[i]= values[i-1];
    
    }
   }
   

   public static void main( String[] args )
   {
      int[] testValues = { 3, 5, 6, 1 };
      ArrayMethods tester = new ArrayMethods( testValues );
      tester.printArray();
      tester.swapFirstAndLast();
      tester.printArray();

      
   }
}