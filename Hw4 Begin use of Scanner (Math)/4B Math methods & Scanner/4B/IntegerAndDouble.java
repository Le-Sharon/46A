import java.util.*;
/**
 * Scan inputs and use inputs number to calculate using Math class methods
 *
 * @author: Sharon Le
 * @version: 2/18/2021
 */

public class IntegerAndDouble
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The integer number is " + number + ".");
        System.out.print("Enter a double number: ");
        double number2 = input.nextDouble();
        System.out.println("The double number is " + number2 + ".");
        double numberSqrt = Math.sqrt(number2);
        System.out.println("The square root of the double number is " + numberSqrt + ".");
        int numberRound = (int) number2;
        System.out.println("The integer part of the double number is " + numberRound + ".");
        double numberQuotient = number / number2;
        System.out.println("The quotient of the integer number divided by the double number is " + numberQuotient + ".");
        numberQuotient = number / (double) numberRound; // int / double = double &  double/int = int(double)
        System.out.println("The double quotient of the integer number divided by the integer part of the double number is " + numberQuotient + ".");
        int numberQuotient2 = number / numberRound;
        System.out.println("The integer quotient of the integer number divided by the integer part of the double number is " + numberQuotient2 + ".");
        //% gets a remainder when dividing
        System.out.println("The remainder of the integer number divided by the integer part of the double number is " + (number%numberRound) + ".");
        input.close();
    }
}
