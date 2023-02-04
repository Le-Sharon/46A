
/**
 * Write a description of class LoppyFun here.
 *
 * @author: Sharon Le
 * @version: 3/6/2021
 */
public class LoopyFun
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class LoppyFun
     * 
     * @param num given value
     */
    public LoopyFun(int num)
    {
        if (num == 0)
        {
            x = 1;
        }
        else if (num < 0)
        {
            x =  Math.abs(num);
        }
        else
        {
            x = num;
        }
    }

    /**
     * gets stored number
     * 
     * @return stored number
     */
    public int getNum()
    {
        // put your code here
        return x;
    }
    
    /**
     * calculates the factorial of the given number
     * 
     * @return factorial of number
     */
    public int factorial()
    {
        int count = 1;
        int factorials = 1;
        do//(int count = 1; count <= x; count++)
        {
            factorials = factorials * count;
            count++;
        }
        while(count <= x);
        return factorials;
    }
    
    /**
     * calculates the twos with the exponents of the factor of given values
     * 
     * @return all sum of twos with the exponents of factor of given number
     */
    public int sumOfPowersOfTwo()
    {
        int count = 0;
        double sum = 0;
        int twos = 2;
        do//(int count = 0; count < x; count++)
        {
            sum = sum + Math.pow(twos,count);
            count++;
        }
        while (count < x);
        int allSum = (int)(sum);
        return allSum;
    }
    
}
