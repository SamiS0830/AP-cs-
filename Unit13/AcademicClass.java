import java.util.ArrayList;

public class AcademicClass{
    public AcademicClass(ArrayList<Student> students, Teacher t){
        this.teacher = t;
        this.students = students;
    }
    
    public void addStudent(Student s){
        students.add(s);
    }
    public void setTeacher(Teacher teach){
        Teacher t = teach;
    }
    public void classInfo(){
        for(Student s : students){
            System.out.println(s);
        }
        System.out.println(t); 
    }
    
    public ArrayList<Student> oddNumb(){
        ArrayList<Student> stud = new ArrayList<Student>();
        for(Student s : students){
            if(s.favoriteNumber%2==0){
                stud.add(s);
            }
        }
    }
    public ArrayList<Student> favNumber(int n){
        ArrayList<Student> Result = new ArrayList();
        for(Student s : students){
                Result.add(s);
            }
        }
        return Result;
    }
    
    public static void main(String[] args){
        AcademicClass classA = new AcademicClass();
        //this is an object, bc it is an instance of a class
        classA.addStudent(new Student("Jimmmy", 4));
        classA.addStudent(new Student("Annie Smith", 3));
        classA.addStudent(new Student("Shirlie",5));
        //this moves the objects INTO an arrayLIST HELD BY THE CLASS OBJECT

        classA.setTeacher(new Teacher("Mr. Smith", "Math"));
        classA.classInfo();
   
            System.out.println("Favorite Number:" + classA.n + classA.favNumber(3) + "odd numb" +      classA.oddNumb());
    }
    
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>();
    
}