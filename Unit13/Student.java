public class Student{
    public Student(String name, int favoriteNumber){
    this.name= name;
    this.favoriteNumber=favoriteNumber;
    }
    public String getName(){
        return name;
    }
    public int favNumber(){
        return favoriteNumber;
    }
    private String name;
    private int favoriteNumber;
}