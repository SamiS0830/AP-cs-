public class Greetings{
public static String greetings(String name){
 return "Hello, " + name + ", how are you?";
}

public static void testGreetings(String name, String expected){
   
    String result = greetings(name);
    System.out.println("name: " + name + "expected:" +expected + "result " + result);
        
    if(result.equals(expected)){
        System.out.println("yuayyy");                  
    }
    else{
        System.out.println("booo");
    }
}
public static void main(String[] args){
    testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
    testGreetings("Annie", "Hello, Annie, how are you?");
    testGreetings("friend", "Hello, friend, how are you?");
}
}