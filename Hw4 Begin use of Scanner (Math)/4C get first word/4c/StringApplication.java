import java.util.*;
/**
 * Scan for book title and uses substrings for get first word,letter
 * of the book title and etc...
 *
 * @author: Sharon Le
 * @version: 2/18/2021
 */

public class StringApplication
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a book title: ");
        String book = input.nextLine();
        System.out.println("The first character is '" + book.charAt(0) + "'.");
        //detects the first instance of a space encountered in book string
        int firstSpace = book.indexOf(" ");
        System.out.println("The first word is \"" + book.substring(0 , firstSpace) + "\".");
        System.out.println("The rest of title is \"" + book.substring(firstSpace + 1) + "\".");
        System.out.print("Enter the starting position for a substring: ");
        int start = input.nextInt();
        System.out.print("Enter the length for the substring: ");
        int length = input.nextInt();
        System.out.println("The " + length + "-char substring starting at index "+ start + " is \"" + book.substring(start, start + length) + "\".");
        input.close();
    }
}
