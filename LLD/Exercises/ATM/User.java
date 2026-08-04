package LLD.Exercises.ATM;

public class User {
    
    BankAccount account;
    ATMCard card;

    String name;

    User(String name){
        this.name = name;
    }

    public void setUserAcc(BankAccount account){
        this.account = account;
    }

    public void setUserCard(ATMCard card){
        this.card = card;
    }

    public String getUserName(){
        return name;
    }

    public BankAccount getUserAccount(){
        return account;
    }

    public ATMCard getUserATMCard(){
        return card;
    }
    
}
