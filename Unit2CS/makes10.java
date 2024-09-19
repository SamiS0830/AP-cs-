public class makes10
{

public static boolean makes10(int a, int b) {
  return(a==10 || b==10 || a+b==10);

}

public static void testMakes10(int a, int b, boolean expected){

boolean result = makes10( a, b);

System.out.println("a;" + a + "b;"+b + "expected;" + expected + result + "result");
}

    public static void main(String[] args)
    {
    testMakes10(3,7,true);
    testMakes10(10,8,true);
    testMakes10(3,4,false);
        
    }
}