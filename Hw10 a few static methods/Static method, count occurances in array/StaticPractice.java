import java.util.ArrayList;
/**
 * a utility class StaticPractice with several 
 * static methods to work with arrays and arraylists.
 *
 * @author: Sharon Le
 * @version: 5/1/21
 */
public class StaticPractice
{
    // instance variables - replace the example below with your own
    /**
     * Gets the average value of all positive elements in the array. 
     * The array has size values, and, if the array has no positive elements,
     * returns 0.
     * 
     * @param numbers given array of integers
     * @param size given size of the wanted average
     * 
     * @return average of all number in array. zeros if found no positives int.
     */
    public static double averageOfPositive (int[] numbers, int size)
    {
        double sum = 0;
        double count = 0;
        if(size > 0)
        {
            for (int x = 0; x < size; x++)
            {
                if (numbers[x] > 0)
                {
                    sum = sum + numbers[x];
                    count++;
                }
            }
            sum = sum/count;
        }
        return sum;
    }

    /**
     * Gets the averagevalue of all positive elements in the array list. 
     * If the array listhas no positive elements, returns 0. 
     * 
     * @param numbers given list of numbers
     * 
     * @return average of all number in arraylist. zeros if found no positives int.
     */
    public static double averageOfPositive (ArrayList<Integer> numbers)
    {
        double sum = 0;
        double count = 0;
        for (int temp : numbers)
        {
            if (temp > 0)
            {
                sum = sum + temp;
                count++;
            }
        }
        if (count > 0)
        {
            return sum/count;
        }
        else
        {
            return sum;
        }
    }

    /**
     * Gets the count of occurrences of target in the array. The array has size values.
     * 
     * @param list given list of strings arrays
     * @param size given size of the wanted range of strings
     * @param target given targetted words to find
     * 
     * @return count of targetted words in arrays. zeros if found none.
     */
    public static int count(String[] list, int size, String target)
    {
        int counter = 0;
        for (int i = 0; i < size; i++)
        {
            if (list[i].equals(target))
            {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Gets the count of occurrences of target in the array list.
     * You should use the enhanced for loop.
     * 
     * @param list given list to find
     * @param target given targetted words to find
     * 
     * @return count of targetted words in list. zeros if found none.
     */
    public static int count(ArrayList<String> list, String target)
    {
        int counter = 0;
        for (String temp : list)
        {
            if (temp.equals(target))
            {
                counter++;
            }
        }
        return counter;
    }
}
