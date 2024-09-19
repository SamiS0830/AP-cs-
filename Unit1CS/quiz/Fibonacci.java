public class Hello
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(a=1; a>30; a++){
           
            int c = a+b;
            a=b;
            b=c;
            c++;
       
            System.out.println(c);
                
        }
        
    }
}