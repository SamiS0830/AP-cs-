public class ZNameLength{
    public static int countZNames(String[] name){
        int total = 0;
        for(String value : name){
            if(value.length()<1){
                return -1;
            }
            if(value.substring(0,1).equals("Z")){
                total += value.length();
            }
        }
        return total;
    }
    
    public static void testCountZNames(String[] name, int expected){
        int result = countZNames(name);
        System.out.println("Name: " + name + ", expected, " + expected + ", Result, " + result);
        
        if(result == expected){
            System.out.println("Yayyy");
        }
        else{
            System.out.println("Boooo");
        }
    }
    public static void main (String[] args){
        String[] name = {"Dr. Kessner", "Dr. Sands"};
        String[] name1 = {"Zorro", "Zero", "Zippy"};
        
        testCountZNames(name, 0);
        testCountZNames(name1, 14);
    }
}