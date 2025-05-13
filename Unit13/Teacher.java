public class Teacher{
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public String getName(){
        return name;
    }
    public String subject(){
        return subject;
    }
    public String toString(){
        return getName() + subject();
    }
    private String name;
    private String subject;
}