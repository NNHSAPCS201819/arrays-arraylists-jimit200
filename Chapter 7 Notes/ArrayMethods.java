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
            temp[i] = values[i];

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

    public void evenOdd()
    {

        if(values.length%2==0){
            //even
            int element1 = values.length/2;
            int element2= element1 -1;
            int[] removed = new int[values.length-2];

            for(int i =0; i<values.length;i++)
            {
                if((i!=element1)&&(i!=element2) ){
                    if(i>element2) 
                    {
                        removed[i-2]=values[i];

                    }
                    else{
                        removed[i]=values[i];

                    }
                }
            }

            values= removed;
        }
        else{
            //odd
            int element=(int)(values.length/2.0);

            int[] removed = new int[values.length-1];

            for(int i =0; i<values.length;i++)
            {
                if(i!=element ){
                    if(i>element) 
                    {
                        removed[i-1]=values[i];

                    }
                    else{
                        removed[i]=values[i];

                    }
                }
            }
            values=removed;
        }

    }
    
    public void moveEvenToFront()
    {
        int currentPos=0;
        for(int i = 0; i<values.length; i++ )
        {
            if (values[i]%2==0){
                 int copy = values[currentPos];
                 values[currentPos] = values[i];
                 values[i] = copy;
                 currentPos++;
            }
        }
    
    }
    public void secondLargest()
    {
    int max = values[0];
    int max2=values[0];
        for (int val : values)
        {
            if (max < val)
            {
                max2= max;
                max = val;
            }
        }
        System.out.println("second largest "+ max2);
    }
    public static void main( String[] args )
    {
        int[] testValues = { 3, 5, 6, 1,8 };
        ArrayMethods tester = new ArrayMethods( testValues );
        tester.printArray();
        tester.secondLargest();
        tester.printArray();

    }

    
}