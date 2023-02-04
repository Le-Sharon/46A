/**
 /* Call some string methods on different string objects.
 * 
 * @author: Sharon Le
 * @version: 2/5/2021
 */
public class SpringBreak
{
    public static void main(String[] args)
    {
        String word =  "St. Patrick's Day"; 
        int index = 0;                      
        int size = 5;                       
        // Do not change the lines above
        
        
        System.out.println("The given string: " + word);
        System.out.println("The length: " + word.length());
        System.out.println("The character at index " + index + ": " + word.charAt(index));
        System.out.println("The size " + size + " substring starting at index " + index + ": " + word.substring(index, size + index));
        // get letters from 1 to 4 by method substring
    
        //System.out.println(word.substring(index,size));
        System.out.println("ALL UPPER CASE: " + word.toUpperCase());
        System.out.println("all lower case: " + word.toLowerCase());
        String word2 = word.toLowerCase();
        System.out.println("all lower case with space removed: " + word2.replaceAll(" ", ""));
        System.out.print("The original word with ' ' replaced by '_': ");
        System.out.println(word.replaceAll(" ","_"));
        
    }
}