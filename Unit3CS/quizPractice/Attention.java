public class Attention{
public static boolean attention(String string){
    if(string.length()<8){
        return false;
    }
    String hey = string.substring(0,9);
     if(hey.equals("Hey, you!")){
         return true;
     }
    else{
        return false;
    }
}
}
