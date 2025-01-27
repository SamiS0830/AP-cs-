import java.util.ArrayList;
public class PersonsStats{
    
    public static int numberPets(ArrayList<Persons> person){
        int result = 0;
        for(Persons p : person){
            result+= p.getPets();
        }
        result= result/person.size();
        return result;
    }
    public static String mostPets(ArrayList<Persons> person){
         String result = "";
         int test = 0;
         for(Persons p : person){
             if(p.getPets()>test){
                test= p.getPets();
                 result= p.getName();
             }
         }
        return result;
    }
    public static ArrayList<Persons> twoPets(ArrayList<Persons> person){
        ArrayList<Persons> result = new ArrayList<Persons>();
        for(Persons p : person){
            if(p.getPets()>2){
                result.add(p);
            }
        }
        return result;
        
    }
    public static void main(String[] args){
        ArrayList<Persons> test1 = new ArrayList<Persons>();
         test1.add(new Persons("Willy", 5));
        test1.add(new Persons("Smith", 50));
              test1.add(new Persons("john", 2));
        
        System.out.println(numberPets(test1) + " " + mostPets(test1) +" "+ twoPets(test1));
        

        ArrayList<Persons> test2 = new ArrayList<Persons>();
         test2.add(new Persons("margo robie", 10));
        test2.add(new Persons("smina", 2));
              test2.add(new Persons("lobo", 0));
        
        System.out.println(numberPets(test2) + " " + mostPets(test2) +" "+ twoPets(test2));
        
        
    }
}