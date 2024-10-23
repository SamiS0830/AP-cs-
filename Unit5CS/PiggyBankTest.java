public class PiggyBankTest{
    public static void main(String[] args){
    PiggyBank bank = new PiggyBank();
    bank.addQuarter();
    bank.addDime();
    bank.addQuarter();
    
    System.out.println("My Total is:" + bank.getTotal());
    }
}