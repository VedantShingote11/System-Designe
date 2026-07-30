package LLD.Exercises.VendingMachine.States;

import java.util.ArrayList;
import java.util.List;

import LLD.Exercises.VendingMachine.Coin;
import LLD.Exercises.VendingMachine.Item;
import LLD.Exercises.VendingMachine.VendingMachine;

public class SelectItem implements State{
    
    public SelectItem(){
        System.out.println("This is Select Item state");
    }

    @Override
    public void pressAcceptCoinButton(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
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
        
        Item item = vendingMachine.getItem(code);

        if(item == null){
            System.out.println("Sorry , Item unavailable");
            return;
        }

        int coinTotal = vendingMachine.getCoinTotal();
        int itemTotal = vendingMachine.getItemTotal();

        if(coinTotal < itemTotal + item.getPrice()){
            System.out.println("Insufficient amount");
            refund(vendingMachine);
            return;
        }

        System.out.println("Item selected - "+item.toString());

        vendingMachine.getItemList().add(code);

    }

    @Override
    public void pressDispenceItemButton(VendingMachine vendingMachine){
        vendingMachine.setVendingMachineState(new DispenceItem());
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
