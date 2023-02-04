import java.util.ArrayList;
/**
 * ArrayList class for class Frog
 *
 * @author: Sharon Le
 * @version: 4/10/21
 */
public class FrogList
{
    // instance variables - replace the example below with your own
    private ArrayList<Frog> frog;

    /**
     * Constructor for objects of class FrogList
     * make new ArrayList frog
     */
    public FrogList()
    {
        // initialise instance variables
        frog = new ArrayList<Frog>();
    }

    /**
     * Add a frog at the beginning of the list.
     *
     * @param froggi is the inputted frog
     */
    public void add(Frog froggi)
    {
        // put your code here
        frog.add(0, froggi);
    }

    /**
     * return frog at specific index.
     *
     * @param index is the wanted index
     * @return wanted frog at index
     */
    public Frog get(int index)
    {
        // put your code here
        if (index >= frog.size())
        {
            return null;
        }
        else
        {
            return frog.get(index);
        }
    }

    /**
     * Gets the number of frogs in the list that have a weight in the range between lowLimitand highLimit
     * , inclusive.
     *
     * @param lowLimit low cap
     * @param highLimit high cap
     * @return how many frogs that fit in the limit
     */
    public int countInRange(int lowLimit, int highLimit)
    {
        // put your code here
        int count = 0;
        for (Frog temp : frog)
        {
            if (temp.getWeight() >= lowLimit && temp.getWeight() <= highLimit)
            {
                count ++;
            }
        }
        return count;
    }

    /**
     * Returns thestring returned from calling the toString()
     * method on the list.
     *
     * @return wanted frog at index
     */
    @Override
    public String toString()
    {
        // put your code here
        return frog.toString();
    }
}
