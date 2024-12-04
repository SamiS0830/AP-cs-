import java.util.ArrayList;

public class FindMax{
    public static double findMax(ArrayList<Double> num){
        double result = num.get(0);
        for(double numb : num){
            if(numb>result){
                result=numb;
            }  
        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<Double> value = new ArrayList<Double>();
        value.add(1.0);
        value.add(2.9);
        value.add(5.3);
        System.out.println(findMax(value));
        
        ArrayList<Double> value2 = new ArrayList<Double>();
        value2.add(0.0);
        value2.add(-35.0);
        value2.add(90.1);
        System.out.println(findMax(value2));
        
        ArrayList<Double> value3 = new ArrayList<Double>();
        value3.add(0.4);
        value3.add(0.5);
        value3.add(1.1);
        System.out.println(findMax(value3));
        
    }
}
          
  