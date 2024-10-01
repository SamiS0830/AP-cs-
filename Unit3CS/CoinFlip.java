public class CoinFlip{
    public static String coinFlip(){
        double random = Math.random();
        if(random>0.5){
            return "head";
            
        }
        else{
            return"tail";
        }
    
    }

    public static void main(String[] args){
       
        for(int i=0; i<20; i++){
            String result = coinFlip();
            System.out.println(result);
    }
}
}