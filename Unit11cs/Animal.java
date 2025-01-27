public class Animal{
    public Animal(String name, int legCount, boolean furiness){
        this.name = name;
        this.legCount = legCount;
        this.furiness = furiness;
    }
    
    public String getName(){
        return name;
    }
    public int getLeg(){
        return legCount;
    }
    public boolean getFurry(){
        return furiness;
    }
    private String name;
    private int legCount;
    private boolean furiness;
}