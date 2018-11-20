import java.util.GregorianCalendar;

/**
 * Write a description of class Notes here.
 * 
 * @author gcschmit
 * @version 16 November 2018
 */
public class Notes
{
    public static void createArrayOfEvens()
    {
        /*
         * An array is an ordered collection of multiple elements of
         *      the same type. The type can be a primitive (e.g., int)
         *      or a class (e.g., Turtle).
         *      
         *  An array is like an object in that it must be declared
         *      and initialized.
         *  
         *  The number in the square brackets specifies the number of
         *      elements in the array.
         *  
         *  All elements in the array are initialized to their default
         *      values (e.g., 0, false, null).
         *      
         *  This is an example that creates an array that contains 10
         *      int values.
         */
        int[] evens = new int[10];
        
        /*
         * Set the value of each element in the array to the first
         *      10 positive even integers.
         * 
         *  "length" is used to query the number of elements in
         *      the array.
         *  
         *  Square brackets (i.e., []) are used to reference a
         *      specific element in the array based on its index.
         *      Indicies are 0-based.
         */
        for(int i = 0; i < evens.length; i++)
        {
            evens[i] = (i + 1) * 2;
        }
        
        // print the array's elements
        for(int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i]);
        }
        
        // print the reference to the array
        System.out.println(evens);
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e., curly brackets and comma-separated
         *      values) can be used to initialize an array but only
         *      when the array is declared. The size of the array is
         *      inferred based on the number of elements in the
         *      literal.
         */
        int[] odds = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        
        // this won't compile
        //odds = { 1, 3, 5 };
        
        /*
         * Bounds Error
         * 
         *  Arrays have a fixed sized once initialized.
         *  The index specified must refer to a valid element.
         *  Otherwise, an ArrayIndexOutOfBounds exception is
         *      generated.
         */
        for(int i = 0; i <= odds.length; i++)
        {
            //System.out.println(i + ": " + odds[i]);
        }
        
        /*
         * Array References
         * 
         *  Variables of type array, contain a reference to
         *      the array stored in the computer's memory.
         *      
         *  Assigining one array variable's value to another,
         *      copies the reference, not the array's elements.
         */
        int[] moreOdds = odds;
        
        odds[2] = 6;
        System.out.println(moreOdds[2]);    // prints 6
        
        /*
         * Enhanced For Loop
         *      similar to the "for i in ..." structure in Python
         *      iterates over the elements in an array
         */
        for(int number : odds)
        {
            System.out.println(number);
        }
        
        /* 
         * Limitation of Enhanced For Loops
         *      The local variable (e.g., number) contains a copy
         *          of the value of the element.
         *      Cannot modify the value of the elements in the array.
         *      Cannot easily determine the index of an element.
         */
        for(int number : odds)
        {
            // this doesn't change any element in the array
            number += 1;
        }
        
        for(int number : odds)
        {
            System.out.println(number);
        }
    }
    
    public static void createArrayOfCalendars()
    {
        /*
         * Create an array of 12 calendars, each calendar initialized
         *      for the start of the month.
         *  
         *  When we create an array of objects, each element is
         *      initialized to null. We have to explicitly create
         *      new objects and assign to each element.
         */
        GregorianCalendar[] calendars = new GregorianCalendar[12];
        
        /*
         * At this point, every elemetn in the array has a value of
         *      null.
         */
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
        
        /*
         * Create a new calendar object and assign to each element
         *      in the array.
         */
        for(int i = 0; i < calendars.length; i++)
        {
            calendars[i] = new GregorianCalendar(2018, i + 1, 1);
        }
        
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
        
        /*
         * An enahnced for loop cannot modify the value of the 
         *      elements in the array (e.g., references to calendars),
         *      but we can call mutator methods which modify the
         *      properties of the referenced objects (e.g., day
         *      of the month).
         */
        for(GregorianCalendar calendar : calendars)
        {
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 2);
        }
        
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
    }

}
