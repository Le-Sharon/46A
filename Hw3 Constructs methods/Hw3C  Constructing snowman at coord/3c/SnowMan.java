
/**
 * Constructing method that helps draw multiple snowman at different coordinates 
 * at the same time.
 *
 * @author: Sharon Le
 * @version: 2/11/2021
 */
public class SnowMan
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    public static final int HAT_SIZE = 20;
    public static final int HAT_BRIM_SIDE_SIZE = 10;
    public static final int SMALL_DIAMETER = 20;
    public static final int DIAMETER_INCREMENT = 20;
    public static final int RADIUS_INCREMENT = 10;
    /**
     * Constructor for objects of class SnowMan
     */
    public SnowMan(int upperLeftX, int upperLeftY)
    {
        x = upperLeftX;
        y = upperLeftY;
    }

    /**
     *
     * Draw the Snowman
     */
    public void draw()
    {
        Rectangle hat = new Rectangle (x, y, HAT_SIZE, HAT_SIZE);
        hat.draw();
        hat.fill();
        //draw brim
        Line brim1 = new Line (x - HAT_BRIM_SIDE_SIZE, y + HAT_SIZE, x + HAT_BRIM_SIDE_SIZE + HAT_SIZE, y + HAT_SIZE);
        brim1.draw();
        //draw top circle
        Ellipse topCircle = new Ellipse (x, y + HAT_SIZE, SMALL_DIAMETER, SMALL_DIAMETER);
        topCircle.draw();
        //draw middle circle
        Ellipse midCircle = new Ellipse (x - RADIUS_INCREMENT, y + (2 * DIAMETER_INCREMENT), (2 * DIAMETER_INCREMENT), 2 * DIAMETER_INCREMENT);
        midCircle.draw();
        //draw bottom circle
        Ellipse botCircle = new Ellipse (x - (2 * RADIUS_INCREMENT), y + (2 * 2 * DIAMETER_INCREMENT), 2 * (DIAMETER_INCREMENT + RADIUS_INCREMENT), 2 * (DIAMETER_INCREMENT + RADIUS_INCREMENT));
        botCircle.draw();
    }
}
