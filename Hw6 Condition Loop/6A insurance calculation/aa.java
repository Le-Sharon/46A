
/**
 * Write a description of class aa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class aa
{
    public static void main(String[] args)
    {
        int first = 1;
        int second =1;
        while (second <= 10)
    {
       System.out.println(second);
       int temp = first + second;
       first = second;
       second = temp;
        }

    }
}
