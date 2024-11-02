public class Eight{
    public Eight(){
        
    }
    public String ask(String word){
        int a = (int)Math.random*5 +1;
       if(a < 0.3){
           return "perchange";
       }
        if(a >0.3 && a <0.7){
            return "sure";
        }
        if (a> 0.7){
            return "sure";
        }
        else{
            return "try agains";
        }
        
    
    }
    private String a;
}