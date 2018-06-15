package Lab_problem05;

public class BankAccount {
    private final static double INTEREST_RATE=0.02;
    private static double interestRate=INTEREST_RATE;
    private static int bankAccountCount;
    private int id;
    private double balance;
    public int getId(){
        return this.id;
    }
    public void setId(){
        this.id=++bankAccountCount;
    }

    public static void setInterestRate(double interest){
        interestRate=interest;
    }
    public double getInterest(int years){
        return this.balance*interestRate*years;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    @Override
    public String toString(){
        return "ID"+this.id;
    }
}
