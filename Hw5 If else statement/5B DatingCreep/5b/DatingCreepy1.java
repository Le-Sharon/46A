import java.util.*;
/**
 * This class checks to see if you are dating someone underage. If so, the FBI is coming for u.
 *
 * @name: Alex Chan
 * @version: 2021/02/25
 */
public class DatingCreepy1
{
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 50;
   // public static final int CREEPY_FORMULA = 9;
    public static void main(String[] args)
    {
        Scanner scanInput = new Scanner(System.in);

        //Asking the user for the name, just in case the FBI needs to get involved.
        System.out.print("What is your name? ");
        String userName = scanInput.nextLine();

        //Asking the user for the age, this is where it will make or break this program.
        System.out.print("What is your age? ");
        int userAge = scanInput.nextInt();

        //Checking to see if the person's age can play
        if(userAge < MIN_AGE || userAge > MAX_AGE)
        {
            System.out.println("You are too young or too old for our dating program.");
            System.out.println("Goodbye, " + userName + "!");
            return;
        }

        //Asking your date's age
        System.out.print("What is your date's age? ");
        int dateAge = scanInput.nextInt();
        if(dateAge < 18 || dateAge > 50)
        {
            System.out.println("Your date is too young or too old for our dating program.");
            System.out.println("Goodbye, " + userName + "!");
            return;
        }
        //If the date's age meets the requirement, calculate the creep age. (age / 2 + 7)
        int userCreepyAge = (userAge / 2 + 7);
        int dateCreepyAge = (dateAge / 2 + 7);
        if(dateAge > MIN_AGE || dateAge < MAX_AGE)
        {

            System.out.println("Your creepy age is " + userCreepyAge + ".");
            System.out.println("Your date's creepy age is " + dateCreepyAge + ".");
            if(userAge < MIN_AGE || userCreepyAge <= 22)
            {
                System.out.println("Creepy alert, " + userName + "! You are too young for your date!");
            }
            else if(dateAge < MIN_AGE || dateCreepyAge < MIN_AGE)
            {
                System.out.println("Creepy alert, " + userName + "! Your date is too young for your date!");
            }

            else
            {
                System.out.println("Have a good time, " + userName + "!");
            }

        }
        else
        {
            System.out.println("Your date is too young or too old for our dating program.");
            System.out.println("Goodbye, " + userName + "!");
            return;
        }




    }
}

