public class ParrotTrouble
{
    public static boolean parrotTrouble(boolean talking, int hour) {
    
     if(talking==true && (hour<7|| hour>20)){
      return true;
      
  }
  
  else {
    return false;
    
  }
}
public static void testParrotTrouble(boolean talking, int hour, boolean expected){

    
    boolean result = parrotTrouble(talking, hour);
    
    System.out.println("talking:"  + talking + ", hour:" + hour+  ", expected:" + expected + ", result:" + result);
                       
    if(result==expected){
                       System.out.println("wooo");
    }else{
        System.out.println("meeeerree");
    }
} public static void main(String[] args){ 
    testParrotTrouble(true,6,true);
    testParrotTrouble(true,7,false);
    testParrotTrouble(false,6,false);
    testParrotTrouble(false,7,false);
    
}
}

            
                   
                       
                       