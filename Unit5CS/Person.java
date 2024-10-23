class Person{
    public Person(String nameIn, int favoriteNumberIn){
    name = nameIn;
    favoriteNumber = favoriteNumberIn;
    }
    public void introduction(){
        System.out.println("Hello, My name is" + name);
        System.out.println("and my favorit number is" + favoriteNumber);
    }
    
    private String name;
    private int favoriteNumber;
}