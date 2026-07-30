package LLD.Exercises.VendingMachine.States;

import java.util.List;

import LLD.Exercises.VendingMachine.Coin;
import LLD.Exercises.VendingMachine.Item;
import LLD.Exercises.VendingMachine.VendingMachine;

public class Idle implements State{
    
    public Idle(){
        System.out.println("This is idle state");
    }

    Idle(VendingMachine vendingMachine){
        vendingMachine.setVendingMachineState(new Idle());
    }

    @Override
    public void pressAcceptCoinButton(VendingMachine vendingMachine){
        vendingMachine.setVendingMachineState(new AcceptCoin());
    }

    @Override
    public void addCoin(VendingMachine vendingMachine , Coin coin){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public void pressSelectItemButton(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public void addItem(VendingMachine vendingMachine , String code){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public void pressDispenceItemButton(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public List<Coin> returnChange(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public List<Item> dispenceItems(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

}
