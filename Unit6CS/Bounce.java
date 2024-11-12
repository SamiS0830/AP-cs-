//
// Bounce.java
//


import processing.core.*;
import java.util.*;   // for ArrayList


public class Bounce extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        balls = new ArrayList<BallTest>();
        balls.add(new BallTest(this));
    }

    public void draw()
    {
        background(0);
        for (BallTest b : balls)
            b.display();
    }

    public void keyPressed()
    {
        for (int i=0; i<10; i++)
            balls.add(new BallTest(this));        
    }

    private ArrayList<BallTest> balls;

    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }
}

