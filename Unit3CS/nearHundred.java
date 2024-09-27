public class nearHundred{
    

public static boolean nearHundred(int n){
 return(n>89 && n<111 || n>189 && n<211);
}

public static void testNearHundred(int n, boolean expected){
  boolean result = nearHundred(n);
  
  System.out.println("number: " + n + ", expected:" + expected + ", result: " + result);
  
 if(result == expected){
  System.out.println("yayyy");
  }
  else{
  System.out.println("Booooo");
  }
 }
 
 public static void main(String[] args){
  testNearHundred(100, true);
  testNearHundred(20,false);
  testNearHundred(211, false);
 }
}

