public class ScoreKeeper{
    public ScoreKeeper () {
        total = 0;
    }
    public void scoreNormal(){
        total += 100;
    }
    public void scoreBonus(){
        total += 1000;
    }
    public int getTotal(){
        return total;
    }
    private int total;
}
