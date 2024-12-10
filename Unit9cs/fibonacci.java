public class fibonacci {
    public static int[] list(int n){
        int result[] = new int[n];
        if(n==1){
            int[] a = {1};
          return a;  
        }
        else if(n<1){
            int[] a = {1, 1};
            return a;
            
        }
        result[0] = 1;
        result[1] = 1;
        
        for(int i =2; i<n; i++){
            result[i] = result[i-1]+result[i-2];
        }
        return result;
    } 
    public static void main (String[] args){
     
        System.out.println("List:");
            for(int value : list(1)){
                System.out.println(value);
        }
          
        System.out.println("List:");
            for(int value : list(3)){
                System.out.println(value);
        }
          
        System.out.println("List:");
            for(int value : list(9)){
                System.out.println(value);
        }
     
    }
}