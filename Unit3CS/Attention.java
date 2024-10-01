public class Attention{
public static boolean attention(String str){
  
    if(str.length()<8){
        return false;
    }
    String first = str.substring(0,8);
    
     if(first.equals("Hey you!")){
        return true;
    }
    else{
        return false;
    }
} 
public static void testAttention(String str, boolean expected){
    boolean result = attention(str);
    System.out.println("String:" + str + ", expected: " + expected + "result: " + result);
    
    if(expected ==result){
        System.out.println("wooo");
    }
    else{
        System.out.println("booo");
    }
}
public static void main(String[] args){
    testAttention("Hey you! How are you?", true);
    testAttention("What is your favorite color?", false);
    testAttention("boo", false);
}
}