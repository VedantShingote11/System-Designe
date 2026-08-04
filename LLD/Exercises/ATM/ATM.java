package LLD.Exercises.ATM;

import LLD.Exercises.ATM.ATMStates.State;
import LLD.Exercises.ATM.ATMStates.Idle;

public class ATM {
    
    State state;
    private static ATM atmObject = new ATM();

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM(){

    }

    public void setCurrentATMState(State atmState){
        this.state = atmState;
    }

    public State getATMSate(){
        return state;
    }

    public static ATM getATM(){
        atmObject.setCurrentATMState(new Idle());
        return atmObject;
    }

    public int getATMBalance(){
        return atmBalance;
    }

    public void setATMBalance(int balance , int noOfFiveHundredNotes , int noOfOneHundredNotes , int noOfTwoThousandNotes){
        this.atmBalance = balance;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getTwoThousandNotesCnt(){
        return noOfTwoThousandNotes;
    }
    public int getOneHundredNotesCnt(){
        return noOfOneHundredNotes;
    }
    public int getFiveHundredNotesCnt(){
        return noOfFiveHundredNotes;
    }

    public void deduceFiveHunderdNotes(int value){
        int newValue = getFiveHundredNotesCnt() - value;
        this.noOfFiveHundredNotes = newValue;
    }
    public void deduceTwoThousandNotes(int value){
        int newValue = getTwoThousandNotesCnt() - value;
        this.noOfTwoThousandNotes = newValue;
    }
    public void deduceOneHunderdNotes(int value){
        int newValue = getOneHundredNotesCnt() - value;
        this.noOfOneHundredNotes = newValue;
    }


}
