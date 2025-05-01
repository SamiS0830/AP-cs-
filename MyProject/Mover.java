import processing.core.*;
import processing.sound.*;
import java.util.*;

public class Mover{
    PApplet p;
    PVector pos;
    PVector vel;
    PVector accel;
    float size;
    int c;
    String word;
    ArrayList<SoundFile> zenFile;
    ArrayList<SoundFile> hipFile;
    SoundFile pick;
    boolean sound= true;
    
    public Mover(PApplet p, PVector pos, PVector vel, PVector accel, float size, int c, String word){
        
        
        this.p = p;
        this.pos = pos;
        this.vel = vel;
        this.accel = accel;
        this.size = size;
        this.c = c;
        this.word = word;
        zenFile = new ArrayList<SoundFile>();
        
        zenFile.add(new SoundFile(p, "birds.mp3"));
        zenFile.add(new SoundFile(p, "kyoto.mp3"));
        zenFile.add(new SoundFile(p, "mystic.mp3"));
        zenFile.add(new SoundFile(p, "rain.mp3"));
        zenFile.add(new SoundFile(p, "cheeky.mp3"));
        //zenFile.add(new SoundFile(p, "furelise.mp3"));
        
        hipFile = new ArrayList<SoundFile>();
        
        hipFile.add(new SoundFile(p, "drum.mp3"));
        hipFile.add(new SoundFile(p, "brass.mp3"));
        hipFile.add(new SoundFile(p, "brass.mp3"));
        
       // zenFile.add(new SoundFile(p, "drum.mp3"));
      //  zenFile.add(new SoundFile(p, "brass.mp3"));
      //  zenFile.add(new SoundFile(p, "brass.mp3"));
        
     pick = zenFile.get((int)p.random(0, zenFile.size()));
        pick.jump((float)p.random(0,5));
       pick.play();
        
    }
    
    protected void finalize(){
        if(pick != null){
            pick.pause();
        }
    }
    
    public int letterCount(){
          int total =0;
            total+=(word.length()+5) *5;
            return total;
    }
    
    public void stopSound(){
       
      if (pick != null) {
            System.out.println("Stopping sound...");
            pick.pause();
      }
    if (zenFile != null) {
           zenFile = new ArrayList<SoundFile>();// this is enough
        System.out.println("clear zenFile");
    }

    sound = false;
        }
    
    
    public void display() {
        p.keyPressed();
        p.fill(c);
        p.ellipse(pos.x, pos.y, size, size);
        
        p.textAlign(p.CENTER);
        p.textSize(letterCount());
        p.fill(255);
        p.text(word, pos.x, pos.y);
       
        

     
        
    }
    
    public void outScreen(){
 
        if(pos.x > p.width || pos.y > p.height || pos.x <0 || pos.y < 0){
            vel.mult(-1);
        
        }
    }
    
    
   /* public void applyForce(PVector force)
   {
     PVector f = new PVector(force.x, force.y);
        f.div(mass);
        accel.add(f);
    }*/
    
    public void accelerateRandomly(){
      accel= PVector.random2D();
    }
    
    public void update(){
        vel.add(accel);
       // v.limit(topSpeed);
        pos.add(vel);
        accel.mult(0);
    }
    
    public void keyPressed(){
        if(p.keyCode == PApplet.ENTER){

           /* zenFile = new ArrayList<SoundFile>();
            sound = false;
            pick.stop();*/
        }
    }
    
}