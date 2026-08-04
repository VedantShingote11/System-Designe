package LLD.Exercises.ATM.AmountWithdrawal;

import LLD.Exercises.ATM.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawalProcessor{
    
    public TwoThousandWithdrawProcessor(CashWithdrawalProcessor cashWithdrawalProcessor){
        super(cashWithdrawalProcessor);
    }

    public void withdraw(ATM atm , int remainingAmt){

        int requiredAmt = remainingAmt / 2000;
        int balance = remainingAmt % 2000;

        int cnt = atm.getTwoThousandNotesCnt();

        if(cnt >= remainingAmt){
            atm.deduceTwoThousandNotes(requiredAmt);
        }
        else if(cnt < requiredAmt){

            balance += ((remainingAmt - cnt) * 2000);
            atm.deduceTwoThousandNotes(cnt);

        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }

    }
}
