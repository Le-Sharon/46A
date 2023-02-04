/**
 * A Java class to test class MyNumber.
 *
 * @author  Qi Yang
 * @version 2021-02-22
 */
public class MyNumberTester
{
    public static void main(String[] args)
    {
        MyNumber number = new MyNumber(2500);
        System.out.println(number.getNumber());
        System.out.println("Expected: 2500");
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 2,500");
        System.out.println(number.digitCount());
        System.out.println("Expected: 4");
        
        number = new MyNumber(-10);
        System.out.println(number.getNumber());
        System.out.println("Expected: 10");
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 10");
        System.out.println(number.digitCount());
        System.out.println("Expected: 2");
        
        number = new MyNumber(1000000);
        System.out.println(number.getNumber());
        System.out.println("Expected: 1000000");
        System.out.println(number.formatWithComma());
        System.out.println("Expected: too big");
        System.out.println(number.digitCount());
        System.out.println("Expected: 7");
        
        number = new MyNumber(999);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 3");
        
        number = new MyNumber (1000);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 1,000");
        System.out.println(number.digitCount());
        System.out.println("Expected: 4");
        
        number.setNumber(9999);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 9,999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 4");
        
        number.setNumber(99999);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 99,999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 5");
        
        number.setNumber(999999);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 999,999");
        System.out.println(number.digitCount());
        System.out.println("Expected: 6");
        
        number.setNumber(9);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 9");
        System.out.println(number.digitCount());
        System.out.println("Expected: 1");
        
        number.setNumber(-99);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 99");
        System.out.println(number.digitCount());
        System.out.println("Expected: 2");
        
        number.setNumber(0);
        System.out.println(number.formatWithComma());
        System.out.println("Expected: 0");
        System.out.println(number.digitCount());
        System.out.println("Expected: 1");
    }
}