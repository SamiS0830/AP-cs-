public class testRectangle{
    //why does this have to be a class?
    public static double avPerimeter(Rectangle[][] rect){
        double total =0.0;
        double size=0.0;
       for(int i=0; i<rect.length; i++){
           for(int j=0; j<rect[i].length; j++){
               total+=rect[i][j].getPerimeter();
               size+=1.0;
           }
       }
       total= total/size; 
        return total;
       }
    

    public static Rectangle bigArea(Rectangle[][] rect){
        Rectangle total= rect[0][0];
        double biggestArea = 0.0;
        for(int i=0; i<rect.length; i++){
            for(int j=0; j<rect[i].length; j++){
                if(rect[i][j].getArea()>biggestArea){
                    total=rect[i][j];
                    biggestArea=rect[i][j].getArea();
                }
            }
        }
        return total;
    }

public static void main(String[] args){
    Rectangle[][] rect = {
        {new Rectangle("hi", 5.2, 8.0), new Rectangle("sup", 6.0, 1.5)},
        {new Rectangle("rects", 6.1, 1.3)}
        };
    
System.out.println("averagePer:" + avPerimeter(rect) +" "+ "biggest Area: " + bigArea(rect));
}
}


    
       
    
    
    