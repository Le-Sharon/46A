import java.util.*;
/**
 * determines if you are is a creep
 *
 * @author: Sharon Le
 * @version: 2/25/2021
 */
public class DatingCreepy
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("What is your age? ");
        int age = in.nextInt();
        int legalAge = 18;
        int maxAge = 50;
        int divider = 2;
        int adder = 7;

        // if you are under 18, you are rejected
        if (age < legalAge || age > maxAge)
        {
            System.out.println("You are too young or too old for our dating program.");
            System.out.print("Goodbye, " + name + "!");
            in.close();
            return;
        }
        else
        {
            System.out.print("What is your date's age? ");
            int lover = in.nextInt();
            if (lover < legalAge || lover > maxAge)
            {
                System.out.println("Your date is too young or too old for our dating program.");
                System.out.print("Goodbye, " + name + "!");
                in.close();
                return;
            }
            else
            {
                // calculates the legal range of the age to determing if you're creepy
                int youngestForYou = (age / divider) + adder;
                int youngestForThem = (lover / divider) + adder;
                System.out.println("Your creepy age is " + youngestForYou + ".");
                System.out.println("Your date's creepy age is " + youngestForThem + ".");
                if (lover < youngestForYou)
                {
                    System.out.println("Creepy alert, " + name + "! Your date is too young for you!");
                    in.close();
                    return;
                }
                else if (age < youngestForThem)
                {
                    System.out.println("Creepy alert, " + name + "! You are too young for your date!");
                    in.close();
                    return;
                }
                else
                {
                    System.out.println("Have a good time, " + name + "!");
                    in.close();
                    return;
                }
            }
        }
    }
}
