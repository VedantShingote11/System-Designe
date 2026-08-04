package LLD.Exercises.ATM.AmountWithdrawal;

import LLD.Exercises.ATM.ATM;

public class OneHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    
    public OneHundredWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor){
        super(cashWithdrawalProcessor);
    }

    public void withdraw(ATM atm , int remainingAmt){

        int requiredAmt = remainingAmt / 100;
        int balance = remainingAmt % 100;

        int cnt = atm.getOneHundredNotesCnt();

        if(cnt >= remainingAmt){
            atm.deduceOneHunderdNotes(requiredAmt);
        }
        else if(cnt < requiredAmt){

            balance += ((remainingAmt - cnt) * 100);
            atm.deduceOneHunderdNotes(cnt);

        }

        if(balance != 0){
            System.out.println("Oops someting went wrong");
        }

    }
}
