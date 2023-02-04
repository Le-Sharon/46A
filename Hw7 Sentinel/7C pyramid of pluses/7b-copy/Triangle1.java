import java.util.Scanner;
/**
 * this class draw an isosceles triangle with given number of value
 *
 * @author: Sharon Le
 * @version: 3/29/21
 */
public class Triangle1
{
    public static final int min = 3;
    public static final int max = 10;
    public static void main (String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter an integer between %s and %s (inclusive): ", min, max);
        boolean trueOrFalse = false;
        int num = 0;
        while (!trueOrFalse)
        {
            if (in.hasNextInt())
            {
                num = in.nextInt();
                if (num < min || num > max)
                {
                    System.out.printf("Out of range: %d.%n", num);
                    System.out.printf("Enter an integer between %s and %s (inclusive): ", min, max);
                }
                else
                {
                    for (int x = 1; x <= num; x++)//rows
                    {
                        for (int space = num; space > x; space--)
                        {
                            System.out.print(" ");
                        }
                        int plus = 2 * x - 1; //arithmetic sequence
                        for (int y = 1; y <= plus; y++)//number of pluses
                        {
                            System.out.print("+");
                        }
                        System.out.println();
                        
                    }
                    trueOrFalse = true;
                }
            }
            else
            {
                String error = in.next().trim();
                System.out.printf("Invalid input: \"%s\".%n", error);
                System.out.printf("Enter an integer between %s and %s (inclusive): ", min, max);
            }
            
        }
    }
}
