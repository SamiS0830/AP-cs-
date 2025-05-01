
import processing.core.*;
import java.util.*;



public class Project extends PApplet{
    public void settings(){
        fullScreen();
    }
    
    public void setup(){
    scenes = new ArrayList<Scene>();
        scenes.add(new StartScene(this));
        scenes.add(new PlayScene(this));
        scenes.add(new EndScene(this));
        
        current = 0;
        
 
      
    }
    
    public void draw(){
        
        scenes.get(current).display();
        /*if (current == 1 && ((PlayScene) scenes.get(current)).goButtonPressed()) {
            current = 2;  // Move to EndScene
        }*/
    }
 
    public void keyPressed(){
         if(current==1){
                ((PlayScene) scenes.get(current)).keyPressed();  
        }
        if(keyCode == ENTER){ 
            if(current<1){
                current++;
            }
            else{
                current = 0;
                
            }
        }
        
        if(current>= scenes.size()){
            current = 0;
            scenes.clear();
            scenes.add(new StartScene(this));
            scenes.add(new PlayScene(this));
            scenes.add(new EndScene(this));
        }
       
    }
    private ArrayList<Scene> scenes;
    private int current;
    
    public static void main(String[] args){
        PApplet.main("Project");
    }

    
}