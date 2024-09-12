public class Fibonacci
{
    public static void main(String[] args)
    {
       int a=1;
        int b=1;
        int c=1;
        
    System.out.println(a);
    System.out.println(b);
     for(b=1; b<30;b=b){
         a=b;
        b=c;
          c=a+b;
        System.out.println(c);
         
        
     }
      
    }
}