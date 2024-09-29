public class BackAround{
public String backAround(String str){
    String last = str.substring(str.length()-1);
    return last + str + last;
}

public  void testBackAround(String str, String expected){
    String result = backAround(str);
    System.out.println("String: " + str + ", Expexcted: " + expected + ", Result: " + result);
    
    if(result.equals(expected)){
        System.out.println("Yayyyy");
    }
    else{
        System.out.println("Nooooo");
    }
}

public static void main(String[] args){
    BackAround tester = new BackAround();
    tester.testBackAround("cat", "tcatt");
    tester.testBackAround("smile","esmilee");
    tester.testBackAround("cool", "lcooll");
}
}