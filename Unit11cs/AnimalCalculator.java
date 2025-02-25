import java.util.*;

public class AnimalCalculator{
    public static void main(String[] args){
    ArrayList<Animal> ani = new ArrayList<Animal>();
       ani.add(new Human("Annie", 2, false));
       ani.add(new Cat("meow", 4, true));
       ani.add(new Sponge("Mango", 0, false));
       ani.add(new Centipede("legs", 10, true));
        
        codeCheck(ani);
        averageLegs(ani);
        leastLegs(ani);
    
    }
    public static void codeCheck(ArrayList<Animal> ani){
     for(Animal a : ani){
         System.out.println(a.getName() + " " + a.getLeg() + " " + a.getFurry());
     }
    }
    public static int averageLegs(ArrayList<Animal> ani){
        int result = 0;
        for(Animal a : ani){
            result += a.getLeg();
        }
        result=result/ani.size();
        return result;
    }
    
    
    public static Animal leastLegs(ArrayList<Animal> ani){
        int legCount = 10000000;
        Animal result = new Animal("", 0, true);
        for(Animal a : ani){
         if(a.getLeg()< legCount){
             legCount= a.getLeg();
             result = a;
         }
        }
    return result;
    }
}