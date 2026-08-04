package LLD.Exercises.ATM;

public class BankAccount {
    
    int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    public void updateBalance(int newBalance){
        this.balance = newBalance;
    }
    
}
