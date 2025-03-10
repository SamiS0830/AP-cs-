import java.util.ArrayList;

public class ShapeCollection{
    private ArrayList<Shape> Shapes = new ArrayList<Shape>();
    
    public int NumberOfSides(String shapeName){
        for(Shape shape : Shapes){
           if(shape.getName().equalsIgnoreCase(shapeName)){
            return shape.getSides();
       }  
        }
        return -1;
    }
    public void addShape(Shape shape){
        Shapes.add(shape);
    }
    public int averageSides(){
        int total = 0;
        int numb = 0;
        for(Shape shape: Shapes){
            total+=shape.getSides();
            
        }
        return total/Shapes.size();
    }
    public ArrayList<Shape> evenSides(){
        ArrayList<Shape> total = new ArrayList<Shape>();
        for(Shape shape : Shapes){
            if(shape.getSides() % 2==0){
                total.add(shape);
            }
        }
        return total; 
        
    }
    public static void main(String[] args){
        
        ShapeCollection ShapeHolder = new ShapeCollection();
        ShapeHolder.addShape(new Shape("Rectangle", 4));
        ShapeHolder.addShape(new Shape("Square", 4));
        ShapeHolder.addShape(new Shape("Triangle", 3));
        
        System.out.println("rectanlge sides:" + "  " + ShapeHolder.NumberOfSides("Rectangle") + " AverageSides: "  +  ShapeHolder.averageSides() + " even shapes: " + ShapeHolder.evenSides());
        
    }
    
}

    