import java.util.ArrayList;

public class SumOfSquares{
    public static double sumOfSquares(ArrayList<Double> nums){
        double total = 0.0;
        for(int i = 0; i<nums.size(); i++){
            total+= nums.get(i);
        }
        return total;
    }
    public static void testSumOfSquares(ArrayList<Double> nums, Double expected){
        double result = sumOfSquares(nums);
        System.out.println("nums:" + nums + "expected: " + expected + "Result: " + result);
        
        if(result == expected){
            System.out.println("WOO");
        }
        else{
           System.out.println("BOOO");
        }   
    }
    
    public static void main(String[] args){
        ArrayList<Double> num = new ArrayList<Double>();
        num.add(5.4);
        num.add(12.0);
        num.add(3.6);
        ArrayList<Double> num2 = new ArrayList<Double>();
        num2.add(6.0);
        num2.add(3.2);
        num2.add(0.8);
        ArrayList<Double> num3 = new ArrayList<Double>();
        num3.add(5.6);
        num3.add(2.4);
        num3.add(2.0); 
        
     testSumOfSquares(num, 21.0);
    testSumOfSquares(num2, 10.0);
        testSumOfSquares(num3, 10.0);
    }
}