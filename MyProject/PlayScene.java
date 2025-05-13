import processing.core.*;
import java.util.*;



public class PlayScene implements Scene{
    ArrayList<Mover> movers = new ArrayList<>();
   // ArrayList<PImage> bg;
    ArrayList<String> names;
    PImage bg;
    int randomBg;
    
    public PlayScene(PApplet p){
         this.p = p;
      initialize();
    }
    public void initialize(){
       p.background(0);
         buttonWidth = p.width / 15F;  // Button is 1/5 of screen width
        buttonHeight = p.height / 4F;  // Button is 1/12 of screen height
        buttonY = p.width / 2F - buttonHeight/6 ;  // Center horizontally
        buttonX = p.height - buttonWidth - p.width/6F;  // Positioned near the bottom
        
        movers = new ArrayList<>();
        
       

       /* Background = p.loadImage("fog.png");
        if (Background == null) {
            System.out.println("Image loading failed!");
        } else {
            Background.resize(p.width, p.height);  // Resize image
        } */
        
        names = new ArrayList<>();
        names.add("mount.png");
        names.add("purplemount.jpg");
        names.add("springFlower.jpg");
        names.add("pinkFlower.jpg");
        names.add("mountainss.jpg");
        names.add("moon.jpg");
        names.add("tree.jpg");
        names.add("tree.png");
        names.add("yellow.jpg");
        names.add("sunshine.jpg");
        names.add("water.jpg");
        names.add("creek.jpg");
        
        randomBg = (int)p.random(0, names.size());
        
        bg = p.loadImage(names.get(randomBg));
        
        
        
        goButton = new Button (buttonX, buttonY, buttonWidth, buttonHeight, 30, "", p);
        
       // bg = new ArrayList<PImage>();
      /*  bg.add(p.loadImage("mount.png"));
     //   bg.add(p.loadImage("lake.jpg"));
        bg.add(p.loadImage("purplemount.jpg")) ;
        bg.add(p.loadImage("springFlower.jpg"));
        bg.add(p.loadImage("pinkFlower.jpg"));
        bg.add(p.loadImage("mountainss.jpg"));
        bg.add(p.loadImage("moon.jpg"));
        bg.add(p.loadImage("tree.jpg"));
        bg.add(p.loadImage("tree.jpg"));
        bg.add(p.loadImage("yellow.jpg"));
        bg.add(p.loadImage("sunshine.jpg"));
        bg.add(p.loadImage("water.jpg"));
        bg.add(p.loadImage("creek.jpg"));
       */
       // for(String s : names){
            
       // }
       /* for(PImage b : bg){
            b.resize(p.width, p.height);
        }
      
        bg.add(p.loadImage())*/
    }
    
    
    
    public void display(){
      /*  p.background(0);
        p.clear();
        goButton.display();
        p.fill(255);
        p.textSize(32);
        p.text(buffer, p.width/2F, p.height/2); */
  
        if (goButton.wasClicked(p.mouseX, p.mouseY)){
            
            String[] words = buffer.split(" ");
        p.noStroke();
            
        for (int i = 0; i < words.length; i++) {
            float x = p.random(p.width);
            float y = p.random(p.height);
            PVector vel = new PVector(p.random(10), p.random(10));
            PVector acc = new PVector(p.random(5), p.random(5));
            float size = PApplet.map(words[i].length(), 1, 10, 20, 100);
            int c = p.color(p.random(255), p.random(255), p.random(255));
            
        
            movers.add(new Mover(p, new PVector(x, y), vel, acc, size, c, words[i]));
        
            
           
            //System.out.println(words[i] + words[i].getClass());
            //p.fill(c, 150);
            //p.ellipse(x, y, size, size);
        }
            visualize = true;
            
        }
        if (visualize == true){
            p.background(bg.get(randomBg));
            visualizePoem();
     
        }
        else{
            p.background(0);
            p.clear();
            goButton.display();
            p.fill(255);
            p.textSize(32);
            p.text(buffer, p.width/2F, p.height/2);
  
        }
        
        
       /* for(Mover m : movers){
            if(m.outScreen()==true){
               movers.remove(m);
            }
        }*/
        
    }
    
    public void visualizePoem(){
       // System.out.println("VisualizePoem method called"); 
        if (buffer.isEmpty()) {
            System.out.println("Buffer is empty!");
            return;  // Stop execution if there's no text to visualize
        }
        
        for (Mover mover: movers) {

                mover.letterCount();
                mover.display();
                mover.update();
                mover.outScreen();
                mover.accelerateRandomly();

  
       
            }
              
            }
            
    
    
    public boolean goButtonPressed(){
        return goButton.wasClicked(p.mouseX, p.mouseY);
    }

    public void stopAll(){
        for (Mover mover : movers){
            mover.stopSound();
        }
        movers.clear();
        buffer = "";
        visualize = false;
    }
    public void keyPressed(){
                
       
        if(p.keyCode == PApplet.BACKSPACE){
             if (buffer.length() > 0) {
            buffer = buffer.substring(0, buffer.length()-1);
             }
        }else{
            buffer+=p.key;
            
        }
        
         if(p.keyCode == PApplet.ENTER){
             for(Mover mover : movers){
                  mover.stopSound();
                 System.out.println("Pressed Enter -- Stop Sound");
               
             }
            buffer = "";
            visualize = false;
            
            initialize();
             
        }

        
      
    }
    
    private PApplet p;
    public String buffer = "";
    private Button goButton;
    private float buttonWidth;
    private float buttonHeight;
    private float buttonX;
    private float buttonY;
    private PImage Background;
    private boolean visualized = false;
    private boolean visualize =false;
}