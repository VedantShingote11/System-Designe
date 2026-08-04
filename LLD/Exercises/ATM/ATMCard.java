package LLD.Exercises.ATM;

public class ATMCard {
    
    private BankAccount account;
    private int cvv;
    private int pin = 987;

    ATMCard(BankAccount account){
        this.account = account;
    }

    public BankAccount getBankAccount(){
        return account;
    }

    public void setBankAccount(){
        this.account = null;
    }

    public boolean isPinValid(int pin){
        if(this.pin == pin) return true;
        return false;
    }
    
}
