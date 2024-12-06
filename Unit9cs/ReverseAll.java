public class ReverseAll{
    public static String reverse(String s){
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
        result+= s.substring(i,i+1);
        }
        return result;
    }
    public static String[] reverseAll(String[] words){
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = reverse(words[i]);
        }
        return result;
            
    }
    
        public static void main(String[] args){
        System.out.println(reverse("hii")); 
        System.out.println(reverse("woop")); 
        System.out.println(reverse("pool"));  
            
        String[] s1 = {"heya", "woo", "cba"};
        System.out.println("Array: ");
        String[] rev1 = reverseAll(s1);
        for(String value : rev1){
        System.out.println(value );
        }
        
        String[] s2 = {"heep", "mama", "lap"};
        System.out.println("Array:");
        String[] rev2 = reverseAll(s2);
        for(String value : rev2){
        System.out.println(value);
        }
    
        String[] s3= {"mom", "race", "taco"};
        System.out.println("Array:");
        String[] rev3 = reverseAll(s3);
        for(String value : rev3){
        System.out.println(value);
        }
        
    
       
}
}