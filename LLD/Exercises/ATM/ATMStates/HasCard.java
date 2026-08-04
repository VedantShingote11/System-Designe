package LLD.Exercises.ATM.ATMStates;

import LLD.Exercises.ATM.ATM;
import LLD.Exercises.ATM.ATMCard;

public class HasCard implements State{
    HasCard(){

    }

    @Override
    public void enterCard(ATM atm , ATMCard card){
        throw new UnsupportedOperationException("This state doesnt support this operation");
    }

    @Override
    public void authenticatePin(ATM atm , ATMCard card , int pin){

        if(!card.isPinValid(pin)){
            System.out.println("Invalid pin , Try again");
            return;
        }

        atm.setCurrentATMState(new SelectOperation());
    }

    @Override
    public void pressWithdrawAmountButton(ATM atm){
        throw new UnsupportedOperationException("This state doesnt support this operation");
    }

    @Override
    public void withdrawAmount(ATM atm , ATMCard card , int amount){
        throw new UnsupportedOperationException("This state doesnt support this operation");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new Idle());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
