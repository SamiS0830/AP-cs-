public class doubleX{
public static boolean doubleX(String str) {
  for(int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+1).equals("x")){
       if(str.substring(i+1,i+2).equals("x")){
     return true;
    }
    else{
      return false;
    }
  }
  }
  return false;
  
}
 
public static void testDoubleX(String str, boolean expected){
    boolean result = doubleX(str);
    
    System.out.println("String: " + str + ", expected:" + expected + ", result: " + result);
        
    if(expected == result){
        System.out.println("yayyy");
    }
    else{
        System.out.println("Boooo");
    }
}
    
public static void main(String[] args){
    testDoubleX("xaxxxxx", false);
    testDoubleX("axxaaaa", true);
    testDoubleX("xxxx", true);
}
}
