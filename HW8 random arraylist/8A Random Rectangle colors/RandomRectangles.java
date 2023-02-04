import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class RandomRectangle here.
 *
 * @author: Sharon Le
 * @version (a version number or a date)
 */
public class RandomRectangles
{
    public static final int MAX_X = 100;
    public static final int MAX_Y = 500;
    public static final int MIN_WIDTH = 30;  
    public static final int MAX_WIDTH = 100;   
    public static final int MIN_HEIGHT = 20;
    public static final int MAX_HEIGHT = 80;   
    public static final int GENERATOR_SEED = 202104;
    public static void main (String [] args)
    {
        int rectangles = 0;
        boolean isInt = false;
        Scanner input = new Scanner(System.in);
        while (!isInt)
        {
            System.out.print("Enter a positive integer for the number of rectangles: ");
            if (!input.hasNextInt())
            {
                String error = input.nextLine().trim();
                System.out.printf("Not an integer: \"%s\".%n", error);
            }
            else
            {
                int num = input.nextInt();
                if (num <= 0)
                {
                    System.out.printf("Not positive: %d.%n", num);
                }
                else
                {
                    rectangles = num;
                    System.out.printf("The number of rectangles: %d.%n", rectangles);
                    isInt = true;
                }
            }
        }

        Random generator = new Random (GENERATOR_SEED);
        int smallestArea = Integer.MAX_VALUE;
        Rectangle smallRec = new Rectangle(); // using reference
        for (int i = 0; i < rectangles; i++)
        {
            int xCoord = generator.nextInt(MAX_X);
            int yCoord = generator.nextInt(MAX_Y);
            int width = generator.nextInt(MAX_WIDTH - MIN_WIDTH) + MIN_WIDTH;
            int height = generator.nextInt(MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT;
            Rectangle temp = new Rectangle(xCoord, yCoord, width, height);
            temp.setColor(Color.RED);
            temp.draw();
            int area = (temp.getHeight() * temp.getWidth());
            if (area <= smallestArea)
            {
                smallestArea = area;
                smallRec = temp;
            }

        }
        System.out.printf("The min area: %d.%n", smallestArea);
        smallRec.fill();
        smallRec.setColor(Color.YELLOW);

    }
}
