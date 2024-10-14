public class Factorial{
    public static int factorial(int number){
        int total = 1;
        for(int i = 1; i<=number; i++){
            total *= i;
        }
        return total;
    }
    public static void testFactorial(int number, int expected){
    int result = factorial(number);
        System.out.println("number: " + number + ", expected: " + expected + ", result: " + result);
    if(result==expected){
        System.out.println("YAY");
    }
    else{
        System.out.println("BOO");
    }
        
    
    }
    public static void main(String[] args){
        testFactorial(0,1 );
        testFactorial(1,1 );
        testFactorial(2,2);
        testFactorial(3,6); 
        testFactorial(4,24);
        testFactorial(5,120);
        testFactorial(6, 720);
        testFactorial(7, 5040);
    }
}