package LLD.Exercises.VendingMachine.States;

import java.util.List;

import LLD.Exercises.VendingMachine.Coin;
import LLD.Exercises.VendingMachine.Item;
import LLD.Exercises.VendingMachine.VendingMachine;

public interface State {

    // Idle State

    void pressAcceptCoinButton(VendingMachine vendingMachine);

    // Accept Coin State

    void addCoin(VendingMachine vendingMachine , Coin coin);
    void pressSelectItemButton(VendingMachine vendingMachine);

    // Select Item State

    void addItem(VendingMachine vendingMachine , String code);
    void pressDispenceItemButton(VendingMachine vendingMachine);

    // Dispence Product State

    List<Item> dispenceItems(VendingMachine vendingMachine);
    List<Coin> returnChange(VendingMachine vendingMachine);
    
    // Refund / Cancel Order button for Accept Coin State & Select Item State
    List<Coin> refund(VendingMachine vendingMachine);
    
}
