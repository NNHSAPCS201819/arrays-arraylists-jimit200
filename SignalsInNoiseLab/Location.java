
/**
 * Location object that stores the row and coloumn with get methods
 *
 * @jimit200
 * @12/10/18
 */
public class Location
{
    // instance variables - replace the example below with your own
    private int row;
    private int col;
    /**
     * Constructor for objects of class Location
     * @ param initialRow The row of the specified location
     * @ param initialCol The coloumn of the specified location
     */
    public Location(int initialRow, int initialCol)
    {
        row = initialRow;
        col = initialCol;
    }

    /**
     * returns the row that is stored in the object
     *
     * 
     * @return integer of the row number
     */
    public int getRow()
    {

        return row;
    }

    /**
     * returns the coloumn that is stored in the object
     *
     * 
     * @return integer of the coloumn number
     */
    public int getCol()
    {

        return col;
    }
}
