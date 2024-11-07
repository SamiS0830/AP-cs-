public class CountLucky{
    
    public static int countLucky(int[] nums){
    int total = 0;
    for(int i = 0; i<nums.length; i++){
        if(nums[i]%7==0 || (nums[i]-7)%10 ==0){
            total += 1;
    }
    }
    return total;
    }
    
    public static void countLuckyTest(int [] nums, int expected){
        int result = countLucky(nums);
         System.out.println("total: " + nums + ", expected " + expected + ", result: " + result);
             
        if(result == expected){
            System.out.println("YAY");
        }
        else{
            System.out.println("Booo");
        }
    }
    
    public static void main(String[] args){
     int [] nums = {1,2,3};
     int [] nums2 = {7, 13, 17};
     int [] nums3 ={107, 207};
        
    countLuckyTest(nums, 0);
    countLuckyTest(nums2, 2);
    countLuckyTest(nums3, 2);
    }
}