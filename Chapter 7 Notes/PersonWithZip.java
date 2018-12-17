import java.util.Scanner;
/**
 * this class holds the zip code and name of the person.
 *
 * @jimit200    
 * @12/17/18
 */
public class PersonWithZip
{
    // instance variables 
    private String firstName;
    private String lastName;
    private int zipCode;
    /**
     * Constructor for objects of class PersonWithZip
     */
    public PersonWithZip(String initialFirstName,String initialLastName,int initialZipCode)
    {
        // initialise instance variables
        firstName=initialFirstName;
        lastName= initialLastName;
        zipCode=initialZipCode;
    }

    /**
     * returns the zip code
     */
    public int getZip()
    {

        return zipCode;
    }

    /*
     * returns the first name and last name in a readable format
     */
    public String toString(){
        // puts all the information in one string and returns so the objects can be printed
        String combined = ("Name: " + firstName+" "+lastName+" zip: "+zipCode);
        return combined;
    }

    public static void main(String args[]){

        PersonWithZip[] arrayZips  = new PersonWithZip[3];
        Scanner s = new Scanner(System.in);
        
        //gathers the data
        for(int i =0; i< arrayZips.length;i++){

            System.out.println("Enter first name, last name, and zip code for person #"+(i+1) + " with fields separated by a space");
            arrayZips[i] = new PersonWithZip(s.next(),s.next(),s.nextInt());

        }
        
        //prints all the data using enhanced for loop
        for (PersonWithZip person : arrayZips){
            System.out.println(person);

        }

        
        //finds the person with the smallest zip and stores the index so it can be printed later
        System.out.print("The following person has the least numbered zip code ");
        int leastZip = arrayZips[0].getZip(); 
        int index  = 0;

        for(int i =1; i< arrayZips.length;i++){
            if(arrayZips[i].getZip()<leastZip){
                leastZip = arrayZips[i].getZip();
                index = i;
            }

        }
        System.out.println(arrayZips[index]);
    }
}
