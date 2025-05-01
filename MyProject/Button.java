import processing.core.*;
import processing.core.PConstants;
public class Button{
    public Button(float x, float y, float h, float w, float r, String words, PApplet p){
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.p = p;
        this.r=r;
        this.words = words; 
    }
    private float x;
    private float y;
    private float h;
    private float w;
    private float r;
    private PApplet p;
    private String words;
    private int c;
    private float textX;
    private float textY;
public void display(){
    if(mouseOver(p.mouseX, p.mouseY)){
       int c1 = p.color(255);
      int c2 = p.color(220);
      p.fill(p.lerpColor(c1, c2, 0.2f)); 
    }else{
       p.fill(50);     
         }
    p.stroke(255);
    p.rect(x,y,w,h,r);
    p.fill(0);
    p.textAlign(PConstants.CENTER, PConstants.TOP);
    p.text(words, x, y);
    
    
    
              }
    
public boolean wasClicked(float mx, float my){
    return mouseOver(mx, my) && p.mousePressed;
}
public boolean mouseOver(float mx, float my){
   return mx >= x && mx <= x + w && my >= y && my <= y + h;
}

public int getC(){
    return c;
}
public void mousePressed(){
    if(mouseOver(p.mouseX, p.mouseY)){
      c++;
    }
}
}
