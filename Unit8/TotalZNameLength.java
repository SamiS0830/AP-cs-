import java.util.ArrayList;

public class TotalZNameLength{
    
    public static int countZNames(ArrayList<String> name){
        int total = 0;
        for(String value : name){
            if(value.substring(0,1).equals("z") || value.substring(0,1).equals("Z")){
                total += value.length();
            }
        
        }
            return total;
    }
        
    public static void testCountZNames(ArrayList<String> name, int expected){
       int result = countZNames(name);
    
        System.out.println("Names: " + name + ", expected: " + expected + ", result: " + result);
        
        if(result == expected){
            System.out.println("WOOO");
        }
        else{
            System.out.println("BOOO");
        }
        
    }
    public static void main(String[] args){
    ArrayList<String> name = new ArrayList<String>();
        name.add("Zoila");
        name.add("henry");
        name.add("zipper");
    ArrayList<String> name1 = new ArrayList<String>();
        name1.add("sam");
        name1.add("annie");
        name1.add("zannie");
    ArrayList<String> name2 = new ArrayList<String>();
        name2.add("zoffy");
        name2.add("Zilth");
        name2.add("Reck");
    
    testCountZNames(name, 11);
    testCountZNames(name1, 6);
    testCountZNames(name2, 10);
    
        
    }
    }
