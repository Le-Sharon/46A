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
        //Reduces image by 400, 500 on both sides, avoiding hard code
        theSunFlower.grow(-theSunFlower.getWidth()/3,-theSunFlower.getHeight()/3.308);
        System.out.println("X-coordinate: " + theSunFlower.getX());
        System.out.println("Y-coordinate: " + theSunFlower.getY());
        System.out.println("Width : " + theSunFlower.getWidth());
        System.out.println("Height : " + theSunFlower.getHeight());
        //Knowing current position (400,500) translating to (0,0)
        theSunFlower.translate(-theSunFlower.getX(),-theSunFlower.getY());
        System.out.println("X-coordinate: " + theSunFlower.getX());
        System.out.println("Y-coordinate: " + theSunFlower.getY());
        System.out.println("Width : " + theSunFlower.getWidth());
        System.out.println("Height : " + theSunFlower.getHeight());
    }
}