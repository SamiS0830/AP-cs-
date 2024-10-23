public class RectangleTest{
    public static void main(String[] args){
        Rectangle rect = new Rectangle(2,4);
        
        System.out.println("Area: " + rect.area() + ", Perimeter: " + rect.perimeter() + ", diagonal: " + rect.diagonal());
    }
}