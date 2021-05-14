
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
        if(checkRows() !=0 && checkCols() != 0 && checkDiag() !=0 && checkRows() == checkCols() && checkCols() == checkDiag())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int add(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }

    public int checkRows()
    {
        //first row
        int int1 = add(array[0][0], array[0][1], array[0][2], array[0][3]);
        //2nd row
        int int2 = add(array[1][0], array[1][1], array[1][2], array[1][3]);
        //3rd row
        int int3 = add(array[2][0], array[2][1], array[2][2], array[2][3]);
        //4th row
        int int4 = add(array[3][0], array[3][1], array[3][2], array[3][3]);
        if (int1 == int2 && int1 == int3 && int1 == int4)
        {
            return int1;
        }
        return 0;
    }

    public int checkCols()
    {
        //first col
        int int1 = add(array[0][0], array[1][0], array[2][0], array[3][0]);
        //2nd col
        int int2 = add(array[0][1], array[1][1], array[2][1], array[3][1]);
        //3rd col
        int int3 = add(array[0][2], array[1][2], array[2][2], array[3][2]);
        //4th col
        int int4 = add(array[0][3], array[1][3], array[2][3], array[3][3]);
        if(int1 == int2 && int1 == int3 && int1 == int4)
        {
            return int1;
        }
        return 0;
    }

    public int checkDiag()
    {
        //3rd col
        int int1 = add(array[0][0], array[3][3], array[2][2], array[1][1]);
        //4th col
        int int2 = add(array[0][3], array[1][2], array[2][1], array[3][0]);
        if (int1 == int2)
        {
            return int1;
        }
        return 0;
    }
    
    /*
    public boolean isUnique()
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int x = 0; x <array[i].length; x++)
            {
                int curr = array[i][x];
                for(int r = 0; r < array.length; r++)
                {
                    for(int c = 0; c <array[r].length; c++)
                    {
                        if(array[r][c] == curr && i != r && x != c)
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }*/

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
