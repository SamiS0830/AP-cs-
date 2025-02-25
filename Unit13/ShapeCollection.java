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
    public static int averageSides(ArrayList<Shape> Shapes){
        int total = 0;
        int numb = 0;
        for(Shape shape: Shapes){
            total+=shape.getSides();
            
        }
        return total/Shape.size();
    }
    public static ArrayList<Shape> evenSides(ArrayList<Shape> Shapes){
        ArrayList<Shape> total = new ArrayList<Shape>();
        for(Shape shape : Shapes){
            if(shape.getSides() % 2==0){
                total.add(shape);
            }
        }
        return total; 
        
    }
    public void main(String[] args){
        NumberOfSides(Shapes);
        addShape("Rectangle", 3);
        averageSides(Shapes);
        evenSides(Shapes);
    }
    
}

    