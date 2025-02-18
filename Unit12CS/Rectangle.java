public class Rectangle{
    public Rectangle(String name, double height, double width){
        this.name = name;
        this.height = height;
        this.width = width;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getPerimeter(){
        return 2*width + 2*height;
    }
    public double getArea(){
        return width*height;
    }
    private String name;
    private double height;
    private double width;

}