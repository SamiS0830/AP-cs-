
import processing.core.*;

public class Project extends PApplet{
    public void settings(){
        fullScreen();
    }
    
    public void setup(){
    startscene = new ArrayList<Scene>();
        scene.add(new StartScene(this));
        scene.add(new PlayScene(this));
        scene.add(new EndScene(this));
        
        current = 0;
    }
    
    public void draw(){
        scenes.get(current).display();
    }
 
    public void keyPressed(){
        current++;
        if(current>= scenes.size()){
            current = 0;
        }
    }
    
    public static void main(String[] args){
        PApplet.main("Project");
    }
    private StartScene startscene;
    
    
}