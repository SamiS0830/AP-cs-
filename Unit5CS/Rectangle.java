public class Rectangle{
    public Rectangle(double baseIn, double heightIn){
    base = baseIn;
    height = heightIn;
    }
    public double perimeter(){
        return base*2 + height*2;
    }
    public double area(){
        return base*height;
    }
    public double diagonal(){
        return Math.sqrt(base*2 + height*2);
    }
    private double base;
    private double height;
    
}