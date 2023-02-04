
/**
 * Contructing methods for class Hal9000 tester
 * call on the methods, hal9000 will reply with a sentence.
 *
 * @author: Sharon Le
 * @version: 2/16/2021
 */
public class Hal9000
{
    // instance variables - replace the example below with your own
    private String name;
    private String greetThem;
    private String status;
    private String reply;
    /**
     * Constructor for objects of class Hal9000
     * 
     * @param theName gets the name of the crew mate
     */ 
    public Hal9000(String theName)
    {
        // naming 
        name = theName;
    }
    
    /**
     * Gets name of the crew member
     * 
     * @return name of the crew mate
     */
    public String getName()
    {
        return name;
    }
    
    /**
     *@return a String with "greetings, (name)"
     */
    public String greet()
    {
        greetThem = ("Greetings, " + name + ".");
        return greetThem;
    }
    
    /**
     * give a a status return to user
     * 
     * @return status with crew mate name
     */
    public String giveStatus()
    {
        status = ("Everything is a go, " + name + ".");
        return status;
    }
    
    /**
     * Replace the name of the previous
     * 
     * @param newName gets and assign a new name
     * @return crew mate new name
     */
    public String setName(String newName)
    {
        name = newName;
        return name;
    }
    
    /**
     * Rejecting the command input by crew mate
     * @param whatToDo receive the command made by crew mate
     * @return reply of HAL9000
     */
    public String executeCommand(String whatToDo)
    {
        reply = ("I am sorry, " + name + ". " + "I can't " + whatToDo + ".");
        return reply;
    }
}