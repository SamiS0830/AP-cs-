
import processing.core.*;

public class Project extends PApplet{
    

    public void settings(){
        size(400,400);
    }
    public void setup(){

   
        x = width/2;
        y = width/2;
        vx = 1;
        vy = 1;
         r = 5;
       
    }
    public void draw(){
    background(255);
    checkEdges();
    x+=vx;
    y+=vy;
    fill(0);
    ellipse(x,y,r*2,r*2);
    }
    public void checkEdges(){
         if(x<0||x>400){
            vx*=-1;
        }
        if(y<0||y>400){
            vy*=-1;
        }
    }
    public void keyPressed(){
        if(keyCode == UP){
            r+=2;
        }
    }
    
    public static void main (String[] args){
    PApplet.main("Project");
    }
    private float x;
    private float y;
    private float vy;
    private float vx;
    private float r;
           

}
