public class ScoreKeeperTest{
    public static void main (String[] args){
        ScoreKeeper score = new ScoreKeeper();
            score.scoreNormal();
            score.scoreBonus();
            
            System.out.println("My score:" + score.getTotal());
        }
    }
