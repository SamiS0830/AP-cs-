import processing.core.*;


public class StartScene implements Scene{
    private PImage back;

    
    public StartScene(PApplet p){
        this.p = p;
    }
    
    
    public void setup(){
    back = p.loadImage("tree.png");
    back.resize(p.width, p.height);

        
    }
    public void display(){
        p.background(255);
        p.image(back, 0, 0); 
        

    }
    private PApplet p;
}