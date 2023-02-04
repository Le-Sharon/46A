/**
 * Display the image and resize the image to the desired scale.
 *
 * @Sharon Le
 * @1/29/2021
 */
public class SunFlowers
{
    public static void main(String [] args)
    {
        Picture theSunFlower = new Picture("sunflowers.jpg"); //creating object
        theSunFlower.draw(); //Display the image sunflower.
        System.out.println("X-coordinate: " + theSunFlower.getX());
        System.out.println("Y-coordinate: " + theSunFlower.getY());
        System.out.println("Width : " + theSunFlower.getWidth());
        System.out.println("Height : " + theSunFlower.getHeight());
        
        theSunFlower.grow(-400,-500); // Reduces image by (Width,Height)
        System.out.println("X-coordinate: " + theSunFlower.getX());
        System.out.println("Y-coordinate: " + theSunFlower.getY());
        System.out.println("Width : " + theSunFlower.getWidth());
        System.out.println("Height : " + theSunFlower.getHeight());
        
        theSunFlower.translate(-400,-500);// moves image to (0,0) from (400,500)
        System.out.println("X-coordinate: " + theSunFlower.getX());
        System.out.println("Y-coordinate: " + theSunFlower.getY());
        System.out.println("Width : " + theSunFlower.getWidth());
        System.out.println("Height : " + theSunFlower.getHeight());
    }
}