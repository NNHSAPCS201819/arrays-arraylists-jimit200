import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;
        int count = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int i = 0; i < array.length; i++ )
        {
            sum += array[ i ];
            count++;
        }

        average = sum / count;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] array = createRandomArray(5, 10);
        for(int i = 0; i < (array.length - 1); i++)
        {
            System.out.print(array[i] + "|");
        }
        System.out.print(array[array.length - 1]);
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     */
    public static void linearSearch( int valueToFind )
    {
        int[] array = createRandomArray(20, 10);

        int index = -1;

        for (int i = 0; i < array.length; i ++){
            if (array[i] == valueToFind){
                index = i;
                break;
            }
        }

        System.out.println(index);

        for (int i = 0; i < array.length; i ++){
            System.out.println(i + ": " + array[i]);
        }

    }

    /*
     * Array Algorithm #4: Swap Elements
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     */
    public static void swapElements( int index1, int index2 )
    {
        System.out.println("First List:");
        int[] elements = createRandomArray(10, 20);

        for (int num : elements) {
            System.out.println(num);
        }
        int copy = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = copy; 
        System.out.println("\nNew list:");
        for (int num : elements) {
            System.out.println(num);
        }
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {

        int[] array = createRandomArray( 10, 50 );
        int max = array[0];

        for (int val : array)
        {
            if (max < val)
            {
                max = val;
            }
        }
        printArray(array);
        System.out.println("Max: "+max);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {

        int[] fivePointTwo = createRandomArray( 10, 50 );
        int min=fivePointTwo[0];

        for (int number: fivePointTwo)
        {
            if(number<min)
            {
                min=number;

            }
        }
        printArray(fivePointTwo);
        System.out.println("\nMin= "+(min));
    }

    /*
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] copyArray()
    {
        int[] random = CommonArrayAlgorithms.createRandomArray(10, 50);
        int[] copy = new int[random.length];
        for (int i = 0; i < copy.length; i++){
            copy[i] = random[copy.length-1-i];
            System.out.print(random[i] + " ");
        }
        System.out.println();
        printArray(copy);
        return copy;
    }

}
