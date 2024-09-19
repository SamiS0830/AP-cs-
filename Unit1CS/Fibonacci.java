public class Fibonacci
{
    public static void main(String[] args)
    {
       int a=1;
        int b=1;
        int c=1;
        
    System.out.println(a);
    System.out.println(b);
     for(int e=1; e<30;e++){
          c=a+b;
        System.out.println(c);
     
             
         a=b;
        b=c;
        
     }
      
    }
}