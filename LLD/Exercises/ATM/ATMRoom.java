package LLD.Exercises.ATM;

public class ATMRoom {
    
    ATM atm;
    User user;

    public static void main(String[] args) {
        
        ATMRoom atmRoom = new ATMRoom();

        atmRoom.init();

        atmRoom.atm.getATMSate().enterCard(atmRoom.atm , atmRoom.user.getUserATMCard());
        atmRoom.atm.getATMSate().authenticatePin(atmRoom.atm, atmRoom.user.getUserATMCard(), 987);
        atmRoom.atm.getATMSate().pressWithdrawAmountButton(atmRoom.atm);
        atmRoom.atm.getATMSate().withdrawAmount(atmRoom.atm, atmRoom.user.getUserATMCard(), 2100);

    }

    private void init(){
        this.user = creatUser();
        atm = ATM.getATM();

        atm.setATMBalance(4000, 2, 10, 1);
    }

    private User creatUser(){
        BankAccount account = createBankAccount();
        ATMCard card = createAtmCard(account);

        User user = new User("Vedant");
        user.setUserAcc(account);
        user.setUserCard(card);

        return user;
    }

    private BankAccount createBankAccount(){
        BankAccount account = new BankAccount(5000);
        return account;
    }

    private ATMCard createAtmCard(BankAccount account){
        ATMCard card = new ATMCard(account);
        return card;
    }

}
