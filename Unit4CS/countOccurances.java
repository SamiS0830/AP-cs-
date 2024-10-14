public class countOccurances{
    public static int countOccurances(String word, String segment){
         int total = 0;
        if(word.length()<=segment.length()){
                return 0;
            }
         
        for(int i = 0; i<word.length()-segment.length()+1; i++){
            
            if(word.substring(i,i+segment.length()).equals(segment)){
            total += 1;
        }
        }
        return total;
        
    }
    public static void testCountOccurances(String word, String segment, int expected){
        int result = countOccurances(word, segment);
        System.out.println("Word: " + word + ", segment: " + segment +"expected: " +expected + "result: " + result);
        if(expected==result){
            System.out.println("YAY");
        }
        else{
            System.out.println("BOOO");
        }
  
        }
    public static void main(String[] args){
    testCountOccurances("Mississippi", "iss", 2);
    testCountOccurances("banananana", "na", 4);
    testCountOccurances("Hi", "i", 1);
    testCountOccurances("wewewewe", "e", 4);
    }
    }
