package LLD.Exercises.VendingMachine.States;

import java.util.ArrayList;
import java.util.List;

import LLD.Exercises.VendingMachine.Coin;
import LLD.Exercises.VendingMachine.Item;
import LLD.Exercises.VendingMachine.VendingMachine;

public class AcceptCoin implements State{
    
    public AcceptCoin(){
        System.out.println("This is Accept Coin state");
    }

    @Override
    public void pressAcceptCoinButton(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public void addCoin(VendingMachine vendingMachine , Coin coin){
        System.out.println("Coin added "+coin.toString());
        vendingMachine.getListCoins().add(coin);
    }

    @Override
    public void pressSelectItemButton(VendingMachine vendingMachine){
        vendingMachine.setVendingMachineState(new SelectItem());
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

        List<Coin> ref = new ArrayList<>();
        for(Coin coin : vendingMachine.getListCoins()){
            ref.add(coin);
        }

        vendingMachine.setItemList();
        vendingMachine.setListCoins();

        vendingMachine.setVendingMachineState(new Idle(vendingMachine));

        return ref;

    }

}
