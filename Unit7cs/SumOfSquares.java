public class SumOfSquares{
    public static double sumOfSquares(double[] nums){
        double total = 0;
        for(double value : nums){
            total+= value*value;
        }
        return total;
    }
    
    public static void testSumOfSquares(double[] nums, double expected){
    double result = sumOfSquares(nums);
     
    System.out.println("nums: " + nums + ", expected, " + expected + ", result, " + result);
        
           if(result == expected){
               System.out.println("Yayyyy");
           }
           else{
               System.out.println("Booo");
           }
    }
     
    public static void main (String[] args){
        double [] nums = {0};
        double [] nums1 = {1.0, 2.0, 3.0};
        double [] nums2 = {2.0, 2.0, 2.0};
            
        testSumOfSquares(nums, 0);
        testSumOfSquares(nums1, 14.0);
        testSumOfSquares(nums2, 12.0);
    }
}