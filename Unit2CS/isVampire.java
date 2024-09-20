public class isVampire 
{
 
        public static boolean isVampire(float hour, boolean awake){
          if(awake==true && (hour<6 || hour>22)){
              return true;
          }
        else if (awake== false && (hour>6 || hour<22)){
            return true;
        }
       
         else{
             return false;
         }
                 }
    
    public static void testIsVampire(float hour, boolean awake, boolean expected){
        boolean result = isVampire(hour,awake);
        
        
        System.out.println("Hour:" + hour + ", Awake:" + awake + ", expected:" + expected + "result:" + result);
        
         
             if (result==expected){
                 System.out.println("wawwww");
                 
             }
             
             else{
                 System.out.println("aww");
             }
    }
         public static void main(String[] args)
    {
            testIsVampire(6,true,false);
            testIsVampire(3,true,true);
            testIsVampire(7,false, true);
            
         }
    
    
}