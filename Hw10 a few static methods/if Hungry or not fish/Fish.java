
/**
 * class fish to manage a fish that swim and get hungry
 *
 * @author: Sharon Le
 * @version: 5/2/21
 */
public class Fish
{
    // instance variables - replace the example below with your own
    public static final int NOT_HUNGRY = 1;
    public static final int SOMEWHAT_HUNGRY = 2;
    public static final int HUNGRY = 3;
    public static final int VERY_HUNGRY = 4;
    private int state;
    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {
        // initialise instance variables
        state = NOT_HUNGRY;
    }

    /**
     * changes the fish state to one level hungrier if not in state VERY_HUNGRY.
     */
    public void swim()
    {
        if (state != VERY_HUNGRY)
        {
            state++;
        }
    }
    
    /**
     * Changes the fish state to one level less hungryif not in state NOT_HUNGRY.
     */
    public void eat()
    {
        if (state != NOT_HUNGRY)
        {
            state--;
        }
    }
    
    /**
     * Gets the integer representing the state, an integer 1 through 4.
     * 
     * @return state of fish as integers
     */
    public int getState()
    {
        if (state == NOT_HUNGRY)
        {
            return NOT_HUNGRY;
        }
        else if (state == SOMEWHAT_HUNGRY)
        {
            return SOMEWHAT_HUNGRY;
        }
        else if (state == HUNGRY)
        {
            return HUNGRY;
        }
        else
        {
            return VERY_HUNGRY;
        }
    }
    
    /**
     * Gets a string describing the current hunger state of theFish: "Not hungry", 
     * "Somewhat hungry”,"Hungry", or "Very hungry".Do notuse multiple independent
     * if statementsto determine what to return.
     * 
     * @return the state of fish as string
     */
    public String getHungerLevel()
    {
        switch (state)
        {
            case NOT_HUNGRY:
                return "Not hungry";
            case SOMEWHAT_HUNGRY:
                return "Somewhat hungry";
            case HUNGRY:
                return "Hungry";
            default:
                return "Very hungry";
        }
        
        // if (state == NOT_HUNGRY)
        // {
            // return "Not hungry";
        // }
        // else if (state == SOMEWHAT_HUNGRY)
        // {
            // return "Somewhat hungry";
        // }
        // else if (state == HUNGRY)
        // {
            // return "Hungry";
        // }
        // else
        // {
            // return "Very hungry";
        // }
        
    }
}
