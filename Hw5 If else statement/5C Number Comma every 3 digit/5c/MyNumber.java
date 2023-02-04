
/**
 * get value and determines if it's negative and add comma every 3 digits
 *
 * @author: Sharon Le
 * @version: 3/2/2021
 */
public class MyNumber
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class myNumber
     * stores given values within instance variable x
     * 
     * @param value get given value
     */
    public MyNumber(int value)
    {
        // initialise instance variables
        x = value;
        setNumber(x);
        
    }

    /**
     * get x and returns integer
     * 
     * @return get value and return it
     */
    public int getNumber()
    {
        return x;
    }
    
    /**
     * changes the value of the given number if it's negative
     * 
     * @param value the given value
     */
    public void setNumber(int value)
    {
        x = value;
        int negative = -1;
        if (x < 0)
        {
            x = x * (negative);
        }
    }
    
    /**
     * counts the amount of digits/length within the given value
     * 
     * @return number of digits
     */
    public int digitCount()
    {
        String digit = "" + x;
        int count = digit.length();
        return count;
    }
    
    /**
     * format the given value with commas every 3 digits
     * 
     * @return "too big" if the number exceeds the limit, otherwise return 
     * number in comma formatting.
     */
    public String formatWithComma()
    {
        String number = "" + x;
        int cap = 1000000;
        if (x >= cap)
        {
            return number = "too big";
        }
        else 
        {
            number = String.format("%,d", x);
            return number;
        }
    }
}
