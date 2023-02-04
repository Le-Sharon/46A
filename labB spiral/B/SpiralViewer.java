/**
Viewer for a spiral drawing
 */
public class SpiralViewer
{
    public static void main(String[] args)
    {

        final int GRID_SIZE = 10;
        int endX = 100;
        int endY = 100;
        int startX;
        int startY;
        //Columms
        for (int n = 1; n < 10; n++)
        {
            startX = endX; //110
            startY = endY; //110
            endX = endX; //110
            endY = endY + GRID_SIZE - 2 * GRID_SIZE * n; // 100 + 10 - 20 = 90
            Line lineUp = new Line(startX, startY, endX, endY); 
            lineUp.draw();
            

            startX = endX; // 100
            startY = endY; // 90
            endX = endX + GRID_SIZE - 2 * GRID_SIZE * n;  // 100 + 10 - 20 = 90
            endY = endY; // 90
            Line lineLeft = new Line(startX, startY, endX, endY);
            lineLeft.draw();

            startX = endX; //90
            startY = endY; //90
            endX = endX; //90
            endY = endY + 2 * GRID_SIZE * n; // 90 + 20 = 110
            Line lineDown = new Line(startX, startY, endX, endY);
            lineDown.draw();

            startX = endX;//90
            startY = endY;//110
            endX = endX + 2 * GRID_SIZE * n; // 90 + 20 = 110
            endY = endY;//110
            Line lineRight = new Line(startX, startY, endX, endY);
            lineRight.draw(); 
        }
    }
}