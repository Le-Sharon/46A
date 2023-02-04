import java.util.*;
/**
 * Scan for correct inputs and use inputs number to calculate using Math class methods
 *
 * @author: Sharon Le
 * @version: 3/2/2021
 */

public class IntegerAndDouble
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (input.hasNextInt())
        {
            int number = input.nextInt();
            System.out.println("The integer number is " + number + ".");
            System.out.print("Enter a double number: ");
            if (input.hasNextDouble())
            {
                double number2 = input.nextDouble();
                System.out.println("The double number is " + number2 + ".");
                if (number2 < 0)
                {
                    System.out.println("No square root, since the double number is negative.");
                    
                }
                else
                {
                    double numberSqrt = Math.sqrt(number2);
                    System.out.printf("The square root of the double number is %.4f" + ".\n", numberSqrt);
                }
                double numberQuotient = 0;
                if(number2 == 0)
                {
                    System.out.println("No quotient, since the double number is zero.");
                    
                }
                else
                {
                numberQuotient = number / number2;
                System.out.printf("The quotient of the integer number divided by the double number is %.3f" + ".\n", numberQuotient);
                }
                int numberRound = (int) number2;
                System.out.println("The integer part of the double number is " + numberRound + ".");
                if (numberRound == 0)
                {
                    System.out.println("No quotients or remainder, since the integer part of the double number is zero.");
                }
                else
                {
                    numberQuotient = number / (double) numberRound; 
                    // int / double = double &  double/int = int(double)
                    System.out.printf("The double quotient of the integer number divided by the integer part of the double number is %.2f" + ".\n", numberQuotient);
                    int numberQuotient2 = number / numberRound;
                    System.out.println("The integer quotient of the integer number divided by the integer part of the double number is " + numberQuotient2 + ".");
                    //% gets a remainder when dividing
                    System.out.println("The remainder of the integer number divided by the integer part of the double number is " + (number%numberRound) + ".");
                    input.close();
                    return;
                }
                
            }
            else
            {
                String some2 = input.next();
                System.out.println(some2 + " is not a double number!\nProgram terminated!");
                input.close();
                return;
            }
        }
        else
        {
            String some = input.next();
            System.out.println(some + " is not an integer!\nProgram terminated!");
            input.close();
            return;
        }
    }
}