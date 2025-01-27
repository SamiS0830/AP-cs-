import processing.core.*;
public class BallTest{
    public BallTest(PApplet p){
        this.p = p;
        x = p.width/2;
        y = p.width/2;
        vx = 1;
        vy = 1;
        r = 5;
    }
    public void display(){

    x+=vx;
    y+=vy;
    p.ellipse(x,y,r*2,r*2);
     if(x<0||x>400){
            vx*=-1;
        }
        if(y<0||y>400){
            vy*=-1;
        }
    }
    private PApplet p;
    private float x;
    private float y;
    private float vy;
    private float vx;
    private float r;
}