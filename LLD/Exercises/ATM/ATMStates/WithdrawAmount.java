package LLD.Exercises.ATM.ATMStates;

import LLD.Exercises.ATM.ATM;
import LLD.Exercises.ATM.ATMCard;
import LLD.Exercises.ATM.AmountWithdrawal.CashWithdrawalProcessor;
import LLD.Exercises.ATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import LLD.Exercises.ATM.AmountWithdrawal.OneHundredWithdrawalProcessor;
import LLD.Exercises.ATM.AmountWithdrawal.TwoThousandWithdrawProcessor;

public class WithdrawAmount implements State{
    
    WithdrawAmount(){

    }

    @Override
    public void enterCard(ATM atm , ATMCard card){
        throw new UnsupportedOperationException("This state doesnt support this operation");
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
        
        if(atm.getATMBalance() < amount){
            System.out.println("Insufficient balance in atm machine");
            exit(atm);
        }
        else if(card.getBankAccount().getBalance() < amount){
            System.out.println("Insufficient account balance");
            exit(atm);
        }
        else{

            int atmBalance = atm.getATMBalance();
            atm.setATMBalance(atmBalance - amount , atm.getFiveHundredNotesCnt() , atm.getOneHundredNotesCnt() , atm.getTwoThousandNotesCnt());
            int accBalance = card.getBankAccount().getBalance();
            card.getBankAccount().updateBalance(accBalance);

            CashWithdrawalProcessor processor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawalProcessor(null)));
            
            processor.withdraw(atm, amount);

            exit(atm);

        }
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
