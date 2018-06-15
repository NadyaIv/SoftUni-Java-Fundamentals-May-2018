package Lab_Poblem01;

public class BankAccount {
   private int id;
   private double balance;

   public void setId(int id){
      this.id=id;
   }
   public double getBalance(){
      return this.balance;
   }
   public void deposit(double amount){
      this.balance+=amount;
   }
   public void withdraw(double amount){
      if(this.balance<amount){
         throw new IllegalStateException("Insufficient balance");
      }
      this.balance-=amount;
   }
   @Override
   public String toString(){
      return "ID"+this.id;
   }
}
