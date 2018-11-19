
/**
 * Write a description of class Notes here.
 * 
 * @jimit200
 * @11/16/18
 */
public class Notes
{
    public static void createArray(){
        /*
         * an arrray is an ordered collction of multiple elements of the same type
         * the type can be a primative type or a class(turtle)
         * 
         * an array is like an object in that it must be declared
         * and initialized 
         * 
         * the number in the square brackets specifies the number of elements in the array 
         * 
         * All elements in the array are initialized to their
         * default values(eg. 0, false, null)
         *
         *
         *this is an example that creates an array that contains 10 int values
         *
         */
        int[] evens = new int[10]; 

        /*
         * set the value of each element in the array to the first 10 positive even integers
         *
         *length is used to query the number of elements in the array
         *
         *
         *square brackets are used to reference a specific element in the array based on its index.
         *indecies are 0 based
         */
        for(int i =0; i< evens.length;i++){
            evens[i]= (i+1)*2;
        }
        //print the arrays elements
        for(int i =0; i< evens.length;i++){
            System.out.println(i+":"+evens[i]);
        }

        // print the reerence to the array
        System.out.println(evens);

    
    
    }

    public static void createArrayOfOdds()
    {
        /*
         *an array literal (ie curly bracets and comma seperated values)
         *can be used to initalize an array but only when the array is declared the size of the array 
         *is inferred based on the number of elements in the literal
         */
        int[] odds = {1,3,5,7,9,11,13,15,17,19};
        //this wont compile
        //odds={1,3,5}

        /*
         * bounds error
         * arrays have fixed size once initialized 
         * the index specified must refer to a valid element
         * otherwise an ARRAYINDEXOUTOFBOUNDS exception is generated
         */
        for(int i =0; i<= odds.length;i++){

            //System.out.println(i+":"+odds[i]);

        }
        /*
         * array references 
         * variables of type array contain a refernce to the array stored in the computers memory
         * 
         * 
         * assigning one array variable value to another 
         * copies the reference not the arrays elements
         * 
         */
        int[] moreOdds = odds;
        odds[2]=6;
        System.out.println(moreOdds[2]); //prints 6

        /*
         * Enhanced for loop 
         * 
         * similar to the for i in ... structure in Python
         * iterates over the elements in an array
         */

        for(int number: odds){
            System.out.println(number);
        }
        
        
        /*
         * limitations if enhanced for loops
         *      the local variable eg number contains a copy of the value 
         *      of the value of the element 
         *      cannot modify the value of the elements in the array 
         *      cannot easily ditermine the index...GET CLASS NOTES
         */
        for(int number: odds){
            number+=1;
        }
        for(int number: odds){
            System.out.println(number);
        }
    }


}
