public class PiggyBank{
    public PiggyBank(){
        total = 0;
    }
    public void addQuarter(){
        total += 25;
    }
    
    public void addDime(){
        total +=10;
    }
    public int getTotal(){
        return total;
    }
private int total;

    
}