// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char[][] matrix;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
 
  public CharMatrix(int rows, int cols)
  {
    matrix = new char[rows][cols];
    for(int i = 0; i< rows; i ++)
    {
    for (int j = 0; j< cols;j++)
    {
    matrix[i][j] = ' ';
    }
    }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    matrix = new char[rows][cols];
    for(int i = 0; i< rows; i ++)
    {
    for (int j = 0; j< cols;j++)
    {
    matrix[i][j] = fill;
    }
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
   return matrix.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return matrix[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    return matrix[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    matrix[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    return matrix[row][col] ==' ';
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int i = row0; i<= row1; i ++)
    {
    for (int j = col0; j<= col1;j++)
    {
    matrix[i][j] = fill;
    }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for(int i = row0; i<= row1; i ++)
    {
    for (int j = col0; j<= col1;j++)
    {
    matrix[i][j] = ' ';
    }
    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int count = 0;
        
        for(int col = 0; col < matrix[row].length; col++)
        {
            if( matrix[row][col]!=' '){
            count +=1 ;
        }
    }
        
    
        return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int count = 0;
        
        for(int row = 0; row < matrix.length; row++)
        {
            if( matrix[row][col]!=' '){
            count +=1 ;
        }
    }
        
        return count;
  }
}
