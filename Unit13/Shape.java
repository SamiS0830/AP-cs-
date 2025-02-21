public class Shape{
    public Shape(String Name, int Sides){
        this.Name=Name;
        this.Sides=Sides;
    }
    
    public String getName(){
        return Name;
    }
    public int getSides(){
        return Sides;  
    }
    private String Name;
    private int Sides;
}