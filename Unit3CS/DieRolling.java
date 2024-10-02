public class DieRolling{
    public static int dieRolling(){
        int dieRoll = (int)(Math.random()*6)+1;  
        return dieRoll;
    } 
    
public static void main(String[] args){
    for(int i= 0; i<20; i++){
       int result = dieRolling();
        System.out.println(result);
    }
}
    
}