public class CountLucky{
    public static int countLucky(int [] value){
        int total = 0;
        for(int i = 0; i<value.length; i++){
            if(value[i]%7==0 || (value[i]-7)){
                total+=1;
            }
        }
        return total;
    }
}

public static int TotalZNameLength(String[] name){
    int total = 0;
    for(int i = 0; i<name.length; i++){
       
        if(name.substring(0,1).equals("Z") || name.substring(0,1).equals("z")){

        }
    }
    
}