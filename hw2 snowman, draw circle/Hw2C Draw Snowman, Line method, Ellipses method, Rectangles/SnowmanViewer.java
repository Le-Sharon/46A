
/**
 * Draw a picture of a snowman
 *
 * @author: Sharon Le
 * @version: 2/5/2021
 */
public class SnowmanViewer
{
    public static void main (String [] args)
    {
        // dimension of 20x20
        Rectangle hat = new Rectangle (50, 10, 20, 20);
        hat.draw();
        hat.fill();
        Rectangle rec = new Rectangle(0, 0, 400, 500);
        rec.draw();
        //make a line
        //Rectangle brim = new Rectangle (60, 30, 0, 0);
        //brim.grow(20,0);

        Line brim1 = new Line (40, 30, 80, 30);
        brim1.draw();
        //draw top circle
        Ellipse topCircle = new Ellipse (50, 30, 20, 20);
        topCircle.draw();
        //draw middle circle
        Ellipse midCircle = new Ellipse (40, 50, 40, 40);
        midCircle.draw();
        //draw bottom circle
        Ellipse botCircle = new Ellipse (30, 90, 60, 60);
        botCircle.draw();
    }
}
