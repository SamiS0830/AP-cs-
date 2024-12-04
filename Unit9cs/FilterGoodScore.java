import java.util.ArrayList;
public class FilterGoodScore{
    public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> scores){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int score : scores){
            if(score>90){
                result.add(score);
            }
        }
        return result;
    }
    public static void main (String[] args){
        ArrayList<Integer> scored = new ArrayList<Integer>();
         scored.add(100);
         scored.add(50);
         scored.add(80);
        ArrayList<Integer> goodScores = filterGoodScores(scored);
        System.out.println("good Scores: ");
        for(int numb : goodScores){
           System.out.println(numb);
        }
        ArrayList<Integer> scored2 = new ArrayList<Integer>();
         scored2.add(56);
         scored2.add(91);
         scored2.add(90);
        
        ArrayList<Integer> goodScores2 = filterGoodScores(scored2);
        System.out.println("good Scores: ");
        for(int numb : goodScores2){
           System.out.println(numb);
        }
        ArrayList<Integer> scored3 = new ArrayList<Integer>();
         scored3.add(95);
         scored3.add(10);
         scored3.add(99);
        
         ArrayList<Integer> goodScores3 = filterGoodScores(scored3);
        System.out.println("good Scores: ");
        for(int numb : goodScores3){
           System.out.println(numb);   
        }
    }
}
