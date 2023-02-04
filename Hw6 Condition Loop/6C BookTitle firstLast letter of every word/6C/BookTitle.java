
/**
 * get every first/last letters of every word in a string
 *
 * @author: Sharon Le
 * @version: 3/6/2021
 */
public class BookTitle
{
    // instance variables - replace the example below with your own
    private String title;
    final static int last = 1;
    final static int secondLast = 2;
    final static int first = 1;
    /**
     * Constructor for objects of class BookTitle
     */
    public BookTitle(String bookTitle)
    {
        // initialise instance variables
        title = bookTitle;
    }

    /**
     * This method counting words individually
     * Then, takes the first character and store it in each continuously until the
     * last word of string.and return it.
     *
     * 
     * @return a string consisting of every first letter of every word in the title
     */
    public String firstLetters()
    {
        //empty string
        String each = "";
        
        
        for (int x = 0; x < title.length()-1; x++)
        {
            String singleLetter = "" + title.charAt(x);
            if (singleLetter.equals(" "))
            {
                each = each + title.charAt(x + 1);
            }
            
            if (x == 0)
            {
                each = "" + title.charAt(x);
            }
        }
        
        return each;
    }
    
    /**
     * detects the last letter of the string is a letter or not
     * 
     * @return the last letters of a string skips to second to last if not a letter
     */
    private char lastLetter(String str)
    {
        int index = str.length() - 1;
        char lastChar;
        do
        {
            lastChar = str.charAt(index);
            index--;
        }
        while(!Character.isLetter(lastChar));
        return lastChar;
    }
    
    /**
     * This method count each words then takes the last character of each words
     * and stores it in a string continuously. If the last words is not a letter
     * it would take the second to last instead.
     * 
     * @return last characters of every words in the string
     */
    public String lastLetters()
    {
        String word = "";
        String letter = "";
        int indexOfSpace = title.indexOf(" ");
        while(indexOfSpace != -1)
        {
            word = title. substring(indexOfSpace-1,indexOfSpace);
            letter += word;
            title = title.substring(indexOfSpace+1);
            indexOfSpace = title.indexOf(" ");
        }
        return letter;
    }
    
}

