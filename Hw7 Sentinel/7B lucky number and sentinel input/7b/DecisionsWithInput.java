import java.util.Scanner;
/**
 * Get a series of number and check if it's a lucky number until a sentinel
 * is inputted, then find sums, smallest numbers and total occurances of 5's
 *
 * @author: Sharon Le
 * @version: 3/20/21
 */
public class DecisionsWithInput
{
    // instance variables - replace the example below with your own
    public static final int LUCKY_NUMBER = 5;
    public static final int EVEN_NUMBER_BASE = 2;
    public static final int REMAINDER = 0;
    public static void main (String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer or Q to quit: ");
        int sum = 0;
        int fiveCount = 0, positives = 0;
        int firstNum = 0, smallest = 0;
        while (in.hasNextInt())
        {
            int num = in.nextInt();
            //odds numbers
            if (!(num % EVEN_NUMBER_BASE == REMAINDER))
            {
                sum = sum + num;
            }
            //check if it's 5
            if (num == LUCKY_NUMBER)
            {
                fiveCount ++;
            }
            //check if this is the first input
            if (firstNum == REMAINDER)
            {
                smallest = num;
            }
            else if (firstNum > REMAINDER) //if this is not the first inputted number in the series
            {
                if (num < smallest)// if current input is smaller than the smallest stored value
                {
                    smallest = num; //over write the previous
                }
            }
            if (num > REMAINDER)
            {
                positives ++;
            }
            //if firstNum is greater than 0, it's no longer the first number in the series
            firstNum ++;
            System.out.print("Enter an integer or Q to quit: ");
        }

        System.out.printf("The sum of all odd numbers: %d.%n", sum);
        System.out.printf("The smallest number: %d.%n", smallest);
        if (fiveCount > REMAINDER)
        {
            System.out.printf("%d is my lucky number!%n", LUCKY_NUMBER);
        }
        else
        {
            System.out.printf("No fives!%n");
        }
        System.out.printf("The count of positive numbers: %d.", positives);
    }
}
