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
    private String name;
    private String subject;
}