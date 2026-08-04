package LLD.Exercises.ATM.ATMStates;

import LLD.Exercises.ATM.ATM;
import LLD.Exercises.ATM.ATMCard;

public class Idle implements State{
    
    public Idle(){
        System.out.println("This is idle state");
    }
    public Idle(ATM atm){
        atm.setCurrentATMState(new Idle());
    }

    @Override
    public void enterCard(ATM atm , ATMCard card){
        atm.setCurrentATMState(new HasCard());
    }

    @Override
    public void authenticatePin(ATM atm , ATMCard card , int pin){
        throw new UnsupportedOperationException("This state doesnt support this operation");
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
    public void exit(ATM atm){
        throw new UnsupportedOperationException("This state doesnt support this operation");
    }

    @Override
    public void returnCard(){
        throw new UnsupportedOperationException("This state doesnt support this operation");
    }
}
