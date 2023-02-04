
/**
 * This class manage a 2-D array of integers representing temperature tables. 
 *
 * @author: Sharon Le
 * @version: 4/16/21
 */
public class TemperatureTable
{
    // instance variables - replace the example below with your own
    private int[][] integers;

    /**
     * Constructor for objects of class TemperatureTable
     * 
     * @param num given 2D array
     */
    public TemperatureTable(int[][] num)
    {
        // initialise instance variables
        integers = num;
    }

    /**
     * Gets the average of the specified column.
     *
     * @param  colIndex collum with indexs
     * @return the average of the specific collumn
     */
    public double columnAverage(int colIndex)
    {
        // put your code here 
        // 2D arrays goes variable[rows(y)][collums(x)]
        double count = integers.length;//count how many rows, totalRows = elements per col
        double sums = 0;
        for (int i = 0; i < integers.length; i++)
        {
            sums = sums + integers[i][colIndex]; //diffent rows at the same col
        }
        return sums/count;
    }

    /**
     * Gets the largest value of the specified row.
     *
     * @param  rowIndex collum with indexs
     * @return largest number in row
     */
    public int rowMax(int rowIndex)
    {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < integers[rowIndex].length; i++)//how many elements in row, elements in row = total colu
        {
            if (integers[rowIndex][i] > largest) //same rows, at different col
            {
                largest = integers[rowIndex][i];
            }
        }
        return largest;
    }

    /**
     * Gets the value that is larger than the specified limit, has the max 
     * row index among all values larger than the specified limit, and has 
     * the smallest column index among all such values in the row.Returns 
     * the limit if no values in the 2-D array is larger than the limit.
     *
     * @param  limit cap
     * @return largest number above cap
     */
    public int largerValueInMaxRowMinColumn(int limit)
    {
        //going by collums first
        int largestSoFar = 0;
        for (int y = integers.length - 1; y >= 0; y--) //total rows as indexes, rows cannot be negative cuz they're never empty
        {
            //now by columns
            for (int x = 0; x < integers[y].length; x++)
            {
                if (integers[y][x] > limit)
                {
                    largestSoFar = integers[y][x];
                    return largestSoFar;
                }
            }
        }

        return limit;        
    }
    
}
