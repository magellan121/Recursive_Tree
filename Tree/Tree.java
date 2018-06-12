import gpdraw.*;
public class Tree extends Starter
{
    private DrawingTool dt;
    public Tree()
    {
        dt = new DrawingTool(new SketchPad(600, 600));
        dt.up();
        dt.move(0, -300);
        dt.down();
        dt.turnRight(180);
    }

    public void drawTree(int n, int length, int turn)
    {
        if(n==1)
        { 
            dt.forward(length);
        }
        else
        {
            dt.forward(length);
            dt.turnRight(turn);
            drawTree(n-1, length-length/n, turn);
            dt.forward(-(length-length/n));
            dt.turnRight(-turn*2);
            drawTree(n-1, length-length/n, turn);
            dt.forward(-(length-length/n));
            dt.turnRight(turn);
            //dt.forward(length);
            //dt.forward(-length);
            //dt.home();
        }
    }
}
