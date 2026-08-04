package LLD.Exercises.ATM.AmountWithdrawal;

import LLD.Exercises.ATM.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawalProcessor {
    
    public FiveHundredWithdrawProcessor(CashWithdrawalProcessor nextCashWithdrawalProcessor){
        super(nextCashWithdrawalProcessor);
    }

    public void withdraw(ATM atm , int remainingAmt){

        int requiredAmt = remainingAmt / 500;
        int balance = remainingAmt % 500;

        int cnt = atm.getFiveHundredNotesCnt();

        if(cnt >= remainingAmt){
            atm.deduceFiveHunderdNotes(requiredAmt);
        }
        else if(cnt < requiredAmt){

            balance += ((remainingAmt - cnt) * 500);
            atm.deduceFiveHunderdNotes(cnt);

        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }

    }
}
