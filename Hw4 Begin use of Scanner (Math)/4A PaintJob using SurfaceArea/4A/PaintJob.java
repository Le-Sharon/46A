
/**
 * Receives the given length and width to calculate the paint job total cost
 *
 * @author: Sharon Le
 * @version: 2/23/2021
 */
public class PaintJob
{
    // instance variables - replace the example below with your own
    public static final int SQ_INCHES_PER_SQ_FOOT = 144;
    public static final double WALL_HEIGHT_IN_FEET = 8;
    public static final double DOOR_HEIGHT_IN_INCHES = 80;
    public static final double DOOR_WIDTH_IN_INCHES = 32;
    public static final double WINDOW_HEIGHT_IN_FEET = 5;
    public static final double WINDOW_WIDTH_IN_FEET = 4;
    private double length, width;
    private double wallSurface;
    private double windowArea;
    private double doorArea;
    public static final double AREA_PER_GALLON = 300;
    public static final double COST_PER_GALLON = 31.95;
    public static final double LABOR_COST = 100;
    /**
     * Constructor for objects of class PaintJob
     * @param theLength gets the given length
     * @param theWidth gets the given width
     */
    public PaintJob(double theLength, double theWidth)
    {
        // initialise instance variables
        length = theLength;
        width = theWidth;
    }

    /**
     * gets length of room
     * @return length of room
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * gets floor width of room
     * @return width of room
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * reset original length and width to a new value
     * 
     * @param newLength gets a new value for length
     * @param newWidth gets a new value for width
     */
    public void setDimensions(double newLength, double newWidth)
    {
        length = newLength;
        width = newWidth;
    }
    
    /**
     * calculate the surface area of 4 walls and ceiling
     * @return calculated surface area minus the door and window
     */
    public double surfaceArea()
    {
        //Calculates all surfaces and areas
        wallSurface = (2 * length * WALL_HEIGHT_IN_FEET) + (length * width) + (2 * width * WALL_HEIGHT_IN_FEET);
        windowArea = (WINDOW_HEIGHT_IN_FEET * WINDOW_WIDTH_IN_FEET);
        doorArea = (DOOR_HEIGHT_IN_INCHES * DOOR_WIDTH_IN_INCHES);
        doorArea = doorArea / SQ_INCHES_PER_SQ_FOOT;
        //getting rid of door and windows on wall
        wallSurface = wallSurface - (windowArea + doorArea);
        return wallSurface;
    }
    
    /**
     * Calculate the cost of painting the walls
     * @return the cost of painting all 4 walls and ceiling
     */
    public double costOfPaint()
    {
        return (this.surfaceArea() / AREA_PER_GALLON ) * COST_PER_GALLON;
    }
    
    /**
     * add up the total cost of the job of labor cost and cost of materials
     * @return total cost of job including labor cost
     */
    public double totalJobCost()
    {
        return this.costOfPaint() + LABOR_COST;
    }
}
