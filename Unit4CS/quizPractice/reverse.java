public class Reverse{
    public static String(String word){
        total = "";
        for(int i=0; i<word.length; i++){
            total += word.substring(word.length()-1);
        }
        return total;
    }
}