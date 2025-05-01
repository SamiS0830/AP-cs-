import processing.core.*;


public class StartScene implements Scene{
    private PImage back;

    
    public StartScene(PApplet p){
        this.p = p;
        setup();
    }
    
    
    public void setup(){
   back = p.loadImage("mount.png");
    if (back == null) {
        System.out.println("Image loading failed!");
    } else {
        back.resize(p.width, p.height);  // Resize image
    } 
    }
    public void display(){
  
         if (back != null) {
            p.image(back, 0, 0);
        } else {
            p.background(255);
        }
        p.fill(0);

        p.textFont(p.createFont("Georgia", 30));
        p.text("Start Scene - Press ENTER to Continue", p.width / 3, p.height / 2);
        

        
    }
    private PApplet p;
}