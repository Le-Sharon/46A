
/**
 * class to process an integer array.
 *
 * @author: Sharon Le
 * @version: 4/16/2021
 */
public class IntArray
{
    // instance variables - replace the example below with your own
    private int[] integers;
    private int count;
    /**
     * Constructor for objects of class IntArray
     * 
     * @param given array length and elements in array
     * @param howMany count of filled elements
     */
    public IntArray(int[] given, int howMany)
    {
        // initialise instance variables
        integers = given;
        count = howMany;
    }

    /**
     * Adds value to the end of the arrayif the array is not full
     * and does nothing otherwise.
     *
     * @param value given value to add to list
     * 
     */
    public void add(int value)
    {
        // put your code here
        if (count < integers.length)
        {
            integers[count] = value;
            count++;
        }
    }

    /**
     * Removes the value at the specified index position from the array
     * and shifts any subsequent elements to the left 
     * (subtracts one from their indices)if the index is valid. 
     * The method does nothing if the index is invalid.
     *
     * @param index to be removed if valid
     * 
     */
    public void remove(int index) 
    {
        // put your code here
        if (index >= 0 && index < count && count <= integers.length)
        {
            count--; // theArray[10] does not exist; 
            for (int i = index; i < count; i++)
            {
                integers[i] = integers[i + 1];
            }
            
        }
    }

    /**
     * gets the count of the array elements that are not in the specified 
     * range[low, high].
     *
     * @param low low cap
     * @param high high cap
     * @return count of out of ranges
     * 
     */
    public int countOfOutRange(int low, int high) 
    {
        // put your code here
        int counter = 0;
        for (int x = 0; x < count; x++)
        {
            if (!(integers[x] >= low && integers[x] <= high))
            {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Returns the last negative value in the array and 0 if no negative values
     * in the array.
     *
     * @return the last negative in list
     * 
     */
    public int lastNegative() 
    {
        // put your code here
        int negative = 0;
        for (int y = 0; y < count; y++)
        {
            if (integers[y] < 0)
            {
                negative = integers[y];
            }
        }
        return negative;
    }

    /**
     * Returns a string listing all values in the array separated by a comma 
     * and a space and enclosed in a pair of "[" and "]".For example, 
     * [3, 56, 23, -2].
     *
     * @return the last negative in list
     * 
     */
    @Override
    public String toString()
    {
        // put your code here
        String s = "[";
        if (count > 0)
        {
            s += integers[0];
            for (int z = 1; z < count; z++)
            {
                s += ", " + integers[z];
            }
        }
        s += "]";
        return s;
    }
}
