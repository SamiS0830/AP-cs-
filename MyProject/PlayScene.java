import processing.core.*;


public class PlayScene implements Scene{
 
    
    public PlayScene(PApplet p){
        this.p = p;
         buttonWidth = p.width / 15F;  // Button is 1/5 of screen width
    buttonHeight = p.height / 4F;  // Button is 1/12 of screen height
    buttonY = p.width / 2F - buttonHeight/6 ;  // Center horizontally
    buttonX = p.height - buttonWidth - p.width/6F;  // Positioned near the bottom
        setup();
   
    }
    
    
    public void setup(){
        Background = p.loadImage("mount.png");
    if (Background == null) {
        System.out.println("Image loading failed!");
    } else {
        Background.resize(p.width, p.height);  // Resize image
    } 
        goButton = new Button (buttonX, buttonY, buttonWidth, buttonHeight, 30, "Visualize", p);
 
        
    }
    public void display(){
 
        goButton.display();
        p.fill(255);
        p.textSize(32);
        p.text(buffer, p.width/2F, p.height/2);
  
        
        
    

        

    }
    public void keyPressed(){

        if(p.keyCode == PApplet.BACKSPACE){
             if (buffer.length() > 0) {
            buffer = buffer.substring(0, buffer.length()-1);
             }
        }else{
            buffer+=p.key;
        }
     
    }
    private PApplet p;
    private String buffer = "";
    private Button goButton;
    private float buttonWidth;
    private float buttonHeight;
    private float buttonX;
    private float buttonY;
    private PImage Background;
}