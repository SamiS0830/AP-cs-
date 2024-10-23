public class SumofEvens{
    public static int sumOfEvens(int n){
    int total = 0;
    int even = 2;
    for(int i=0;i<=n; i++){
        even *=i;
        total+=even;
        even = 2;
    }
        return total;
}
    public static void testSumOfEvens(int n, int result){
        int expected = sumOfEvens(n);
        if(result==expected){
            System.out.println("Yayy");
        }
        else{
            System.out.println("Boooo");
        }
        System.out.println("number:" + n + "expected: " + expected + "result; " + result);
    }
    public static void main(String [] args){
        testSumOfEvens(1,2);
        testSumOfEvens(2,6);
    }
}