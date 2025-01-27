import java.util.ArrayList;
public class ItemCalculator{
    public static void Print(ArrayList<Item> item){
        for(Item i : item){
            System.out.println(i.getName() + i.getPrice());
            
        }
    }
    public static int averagePrice(ArrayList<Item> item){
        int result = 0;
        for(Item i : item){
            result+= i.getPrice();
        }
        result= result/item.size();
        return result;
    }
    public static String expensiveItem(ArrayList<Item> item){
        String result = "";
        int test = 0;
        for(Item i : item){
            if(i.getPrice()>test){
                test=i.getPrice();
                result = i.getName();
            }
        }
        return result;
    }
    public static void main(String[] arg){
 
     ArrayList<Item> test1 = new ArrayList<Item>();
      test1.add(new Item("apple", 3));
    test1.add(new Item("Jasmine", 0));
        test1.add(new Item("Gucci Purse", 10000));
        
    Print(test1);
    System.out.println(averagePrice(test1) + " expensive: " +expensiveItem(test1));
        
         ArrayList<Item> test2 = new ArrayList<Item>();
      test2.add(new Item("GUCCI HEADBAND", 100000));
    test2.add(new Item("TEMU DOLL", 0));
        test2.add(new Item("JIMMYCHOOS", 300));
        
    Print(test2);
    System.out.println(averagePrice(test2) + " expensive: " +expensiveItem(test2));
 
 
    
    
        
        
        
    }
    
}