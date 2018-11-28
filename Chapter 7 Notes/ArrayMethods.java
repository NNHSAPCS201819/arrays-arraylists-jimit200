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
        for(int i = values.length-1 ; i>= 1;i--){

            values[i] = values[i-1];

        }
        values[0]= last;
    }

    public void replaceEvenWith0()
    {
        for(int i = 0; i<=values.length-1; i++ )
        {
            if (values[i]%2==0){
                values[i]=0;

            }

        }

    }

    public void LargerNeighbor()
    {
        int[] temp = new int[values.length];
        for(int i =0; i<values.length; i++)

        {
            temp[i] = values[temp.length-1-i];

        }
        for(int i = 1; i <values.length-1;i++){
            if(temp[i-1]>temp[i+1]){
                values[i]= temp[i-1];
                
            }
            else{
                values[i]= temp[i+1];
            }

        }

    }
    
    public static void main( String[] args )
    {
        int[] testValues = { 3, 5, 6, 1 };
        ArrayMethods tester = new ArrayMethods( testValues );
        tester.printArray();
        tester.LargerNeighbor();
        tester.printArray();

    }
}