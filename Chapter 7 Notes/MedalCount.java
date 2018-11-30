
/**
 * Write a description of class MedalCount here.
 *
 * @author jimit200
 * @version (a version number or a date)
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    /*
     * can use array literlas to create 2d arrays by nesting curly braces
     */
    
    private int[][] counts = {
    {1,0,1},
    {1,1,0},
    {0,1,0},
    {1,1,0},
    {0,1,1},
    {0,0,0},
    {1,1,1}
    
    
    };
    
    /*
     * constructor for objects of class MedalCount
     * 
     */
    public MedalCount(){
        /*
         * alternate way to create a 2d array, it would
         * be foloowed by nested for loops to initialize each element. 
         */
        //this.counts = new int[COUNTRIES][MEDALS];
        //for....
    
    }
    /*
     * prints the entire medal table
     */
    public void printTable(){
        for (int row=0; row<COUNTRIES; row++){
        
            for( int col = 0; col<MEDALS; col++){
            System.out.print(counts[row][col])
            
            
            }
        
        
        }
    
    
    }
}
