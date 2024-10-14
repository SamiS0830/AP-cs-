public class sumOfSquares{
 public static int sumOfSquares(int number){
     int add = 0;
    for(int i=0; i<=number; i++){
        add+= i*i;
    }
     
     return add;
 }
    public static void testSumOfSquares(int number, int expected){
        int result = sumOfSquares(number);
        System.out.println("number: " + number + "expected: " + expected +"result: " + result);
        
        if(result == expected){
            System.out.println("YAYY");
        }
        else{
            System.out.println("BOOOOOO");
        }
    
    }
    public static void main(String[] args){
        testSumOfSquares(3, 14);
        testSumOfSquares(2, 5);
        testSumOfSquares(1, 1);
        testSumOfSquares(4, 30);
        testSumOfSquares(5, 55);
    }
}