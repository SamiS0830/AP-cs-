
import processing.core.*;

public class Project extends PApplet{
    public void settings(){
        fullScreen();
    }
    
    public void setup(){
    startscene = new StartScene(this);
    startscene.setup();
    }
    
    public void draw(){
        startscene.display();
    }
    public void 
    
    
    public static void main(String[] args){
        PApplet.main("Project");
    }
    private StartScene startscene;
    
    
}