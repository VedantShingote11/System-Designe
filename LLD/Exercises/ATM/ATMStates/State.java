package LLD.Exercises.ATM.ATMStates;

import LLD.Exercises.ATM.ATM;
import LLD.Exercises.ATM.ATMCard;

public interface State {
    
    // Idle
    void enterCard(ATM atm , ATMCard card);

    // Has Card
    void authenticatePin(ATM atm , ATMCard card , int pin);

    // Select Operation
    void pressWithdrawAmountButton(ATM atm);

    // Withdraw Amount
    void withdrawAmount(ATM atm , ATMCard card , int amount);
    void exit(ATM atm);

    void returnCard();

}
