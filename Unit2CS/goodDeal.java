public class goodDeal{
static boolean goodDeal(double originalPrice, double salePrice){
    return(salePrice<(0.75*originalPrice));
}
           
public static void testGoodDeal(double originalPrice, double salePrice, boolean expected){
           boolean result = goodDeal(originalPrice, salePrice);
           
           System.out.println("Original Price:" + originalPrice +", salePrice:" + salePrice + ", expected:" + expected +", result:" + result);
           
           if(result==expected){
               System.out.println("yayyy");
           }
           else{
               System.out.println("booo");
           }
           
}
           public static void main(String[] args){
               testGoodDeal(100,50,true);
               testGoodDeal(40,39,false);
               testGoodDeal(100,75,false);
           }
           }