package LLD.Exercises.ATM.AmountWithdrawal;

import LLD.Exercises.ATM.ATM;

public abstract class CashWithdrawalProcessor {
    
    CashWithdrawalProcessor nextCashWithdrawalProcessor;

    CashWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor){
        this.nextCashWithdrawalProcessor = cashWithdrawalProcessor;
    }

    public void withdraw(ATM atm , int remainingAmt){
        if(nextCashWithdrawalProcessor != null){
            nextCashWithdrawalProcessor.withdraw(atm, remainingAmt);
        }
    }

}
