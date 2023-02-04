
/**
 * Write a description of class word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Word
{
    /**
    Tests whether a letter is a vowel
    @param letter a string of length 1
    @return true if letter is a vowel
     */
    public boolean isVowel(String letter)
    {
        String lower = letter.toLowerCase();
        if (("aeiuo").contains(lower))
        {
            return true;
        }
        else
        {
            return false; 
        }
        
    }
}
