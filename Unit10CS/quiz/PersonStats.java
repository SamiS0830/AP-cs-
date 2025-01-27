public class PersonStats{
    public static int averagePets(ArrayList<Persons> person){
        int result = 0;
        for(Persons p : person){
            result+=p.getPets();
            }
        result = result/person.size();
        }
        return result;
    }
    public static String mostPets(ArrayList<Persons> person){
        String result = "";
        int greatest = 0;
        for(Persons p : person){
            if(p.getPets()>greatest){
                result = p.getName();
                greatest=p.getPets();
            }
        }
        return result;
    }
    public static ArrayList<Person> twoPets(ArrayList<Persons> person){
     ArrayList<Person> result = new ArrayList<Person>();
     for(Persons p : person){
         if(p.getPets>2){
             result.add(p);
         }
     }
        return result;
    }
}