import java.util.Scanner;
/**
 * this class draw an isosceles triangle with given number of value
 *
 * @author: Sharon Le
 * @version: 3/29/21
 */
public class Triangle
{
    public static final int MIN = 3;
    public static final int MAX = 10;
    public static void main (String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.printf("Enter an integer between %s and %s (inclusive): ", MIN, MAX);
        boolean trueOrFalse = false;
        int num = 0;
        while (!trueOrFalse)
        {
            if (in.hasNextInt())
            {
                num = in.nextInt();
                if (num < MIN || num > MAX)
                {
                    System.out.printf("Out of range: %d.%n", num);
                    System.out.printf("Enter an integer between %s and %s (inclusive): ", MIN, MAX);
                }
                else
                {
                    trueOrFalse = true;
                }
            }
            else
            {
                String error = in.next().trim();
                System.out.printf("Invalid input: \"%s\".%n", error);
                System.out.printf("Enter an integer between %s and %s (inclusive): ", MIN, MAX);
            }
            
        }

        for (int x = 1; x <= num; x++)
        {
            for (int space = num; space > x; space--)
            {
                System.out.print(" ");
            }
            int plus = 2 * x - 1;
            for (int y = 1; y <= plus; y++)
            {
                System.out.print("+");
            }
            System.out.println();

        }
    }
}
