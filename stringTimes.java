public class stringTimes{
public static String stringTimes(String str, int n) {
  String total = "";
  
  for(int i = 0; i<n; i++){
    total+= str;
  }
  return total;
}

public static void testStringTimes(String str, int n, String expected){
    String result = stringTimes(str, n);
    
    System.out.println("String: " + str + "number" + n + "expected: " + expected + "result:" + result );
    
    if(expected.equals(result)){
        System.out.println("Wooooo");
    }
    else{
        System.out.println("Booooo");
    }
}

public static void main(String[] args){
    testStringTimes("HI", 3, "HIHIHI");
    testStringTimes("YO", 2, "YOYO");
    testStringTimes("HEYYY", 4, "HEYYYHEYYYHEYYYHEYYY");
}
}