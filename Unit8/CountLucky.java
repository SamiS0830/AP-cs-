import java.util.ArrayList;

public class CountLucky{
    
    public static int countLucky(ArrayList<Integer> number){
    
    int total = 0;
    for(int value : number){
       if(value%7==0 || (value-7)%10==0){
           total += 1;  
       }
    }
    return total;
}
    
    public static void testCountLucky(ArrayList<Integer> values, int expected){
        int result = countLucky(values);
        System.out.println(" ArrayList: " + values + " expected " + expected + " result " + result);
        if(result == expected){
            System.out.println("WOOOO");
        }
        else{
            System.out.println("BOOOOOO");
        }
    }
    public static void main(String[] args){
     ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(7);
        num.add(37);
    ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(8);
        num2.add(7);
        num2.add(38);
    ArrayList<Integer> num3 = new ArrayList<Integer>();
        num3.add(56);
        num3.add(92);
        num3.add(97);
    
    testCountLucky(num, 2);
    testCountLucky(num2, 1);
    testCountLucky(num3, 2);
    }
}
  