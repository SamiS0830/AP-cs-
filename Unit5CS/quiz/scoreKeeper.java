public class ScoreKeeper{
    public static void scoreKeeper(){
      value = 0;
    }
    public static void scoreNormal(){
        value+=100;
    }
    public static void scoreBonus(){
        value +=1000;
    }
    public static getTotal(){
        return value;
    }
    private int value;
}