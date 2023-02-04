
/**
 * Using the Day class, this main class stores today dates and compute days gap between
 * specific dates
 *
 * @author: Sharon Le
 * @version 2/9/2021
 */
public class DayProg
{
    public static void main (String [] args)
    {
        //Part 1 TODAY DATE
        Day today = new Day ();
        //Storing days and months as 2 digits
        String dayDate = today.toString();
        //prints out today dates
        System.out.print("Today is ");
        System.out.println(dayDate + ".");
        
        //Part 2 HOlIDAYS
        Day holiday = new Day (2021, 3, 17);
        dayDate = holiday.toString();
        //prints out holiday date
        System.out.print("The St. Patrick's Day is ");
        System.out.println(dayDate + ".");
        
        //part 3 COUNT GAP
        System.out.print("There are ");
        //dayFrom method cannot be stored in int type
        System.out.print(holiday.daysFrom(today));
        System.out.println(" days until the St. Patrick's Day.");
        
        //Part 4 23 DAYS AGO
        System.out.println("The date of 23 days ago is:");
        //System.out.println();
        //Void method does not return a value so can't use int to store it
        today.addDays(-23);
        System.out.println("   Year : " + today.getYear());
        System.out.println("   Month: " + today.getMonth());
        System.out.println("   Day  : " + today.getDayOfMonth());
    }
}

