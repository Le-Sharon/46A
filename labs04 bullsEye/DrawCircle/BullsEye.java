
/**
 * draw a circle at different coordinate
 *
 * @author: Sharon Le
 * @version: examOneMarch16
 */
public class BullsEye
{
   private int x;
   private int y;
   
   /**
    * Constructs a bulls eye with a given center.
    * @param centerX the x coordinate of the center
    * @param centerY the y coordinate of the center
    */
   public BullsEye(int centerX, int centerY)
   {
       x = centerX;
       y = centerY;
   }
   
   /**
    * Draws the bulls eye
    */
   public void draw()
   {  
      
      Ellipse box3 = new Ellipse(x - d / 2, y - d / 2, d, d);
      box3.draw();
      box3.setColor(Color.BLUE);
      box3.fill();
      
      d = 2 * d / 3;
      //d = d * (2 / 3); does not work
      Ellipse box2 = new Ellipse(x - d / 2, y - d / 2, d, d);
      box2.draw();
      box2.setColor(Color.WHITE);
      box2.fill();
      
      d = d / 2;
      
      Ellipse box = new Ellipse(x - d / 2, y - d / 2, d, d);
      box.draw();
      box.setColor(Color.RED);
      box.fill();
   }
   
   /**
    * Increase the diameter of the BullsEye
    * @param growAmount the amount to increase the diameter of the largest circle by
    */
     public void grow(int growAmount)
   {
      d = d + growAmount;
    }
}     
