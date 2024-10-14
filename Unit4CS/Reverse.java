public class Reverse{
    public static String reverse(String word){
    String total = "";
    for(int i =word.length()-1; i>-1; i--){
        total+=word.substring(i,i+1);
    }
        return total;
    }
    public static void testReverse(String word, String expected){
        String result = reverse(word);
        System.out.println("word: " + word + ", expected " + expected + ", result " + result);
        
        if(expected.equals(result)){
            System.out.println("YAY");
    
        }
        else{
            System.out.println("BOO");
        }
    }
    public static void main(String[] args){
        testReverse("Hello", "olleH");
        testReverse("bad", "dab");
       testReverse("Hello, world!", "!dlrow ,olleH");
       testReverse("tacocat", "tacocat");
        testReverse("testReverse", "esreveRtset");
    }
}