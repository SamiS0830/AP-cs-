public class CountLucky{
    public static int countLucky(Arraylist<Integer> num){
        int total = 0;
        for(int value : num){
            if(value%7== 0){
                total+=1;
            }
        }
        return total;
    }
}


public class SumOfSquares{
    public static double sumOfSquares(ArrayList<Double> num){
        double total = 0.0;
            for(Double value : num){
                total+=value*value;
            }      
    }
    
public class TotalZNames{
    public static int countZNames(ArrayList<String> name){
        String total = "";
        for(String nam : name){
            if(nam.substring(0,1).equals("Z")){
                total+=nam.length();
            }
        }
    }
}
    }
}
}