package LLD.Exercises.VendingMachine.States;

import java.util.ArrayList;
import java.util.List;

import LLD.Exercises.VendingMachine.Coin;
import LLD.Exercises.VendingMachine.Item;
import LLD.Exercises.VendingMachine.VendingMachine;

public class DispenceItem implements State{
    
    public DispenceItem(){
        System.out.println("This is dispence Item State");
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
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public void pressDispenceItemButton(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

    @Override
    public List<Coin> returnChange(VendingMachine vendingMachine){

        List<Coin> change = new ArrayList<>();
        int remain = vendingMachine.getCoinTotal() - vendingMachine.getItemTotal();

        int c=10;

        while(remain > 0){
            if(remain < c){
                c /= 2;
                continue;
            }

            if(c == 10){
                change.add(Coin.TEN);
            }else if(c == 5){
                change.add(Coin.FIVE);
            }else if(c == 2){
                change.add(Coin.TWO);
            }else{
                change.add(Coin.ONE);
            }

            remain -= c;
        }

        vendingMachine.setListCoins();
        
        System.out.println("Change - ");
        for(Coin coin : change)System.out.print(coin.getValue()+" "+coin.toString()+" ");

        return change;
    
    }

    @Override
    public List<Item> dispenceItems(VendingMachine vendingMachine){

        List<Item> items = new ArrayList<>();
        for(String code : vendingMachine.getItemList()){
            Item item = vendingMachine.getItem(code);
            vendingMachine.buyItem(code);
            items.add(item);
        }

        vendingMachine.setItemList();

        vendingMachine.setVendingMachineState(new Idle(vendingMachine));

        System.out.println("Items buyed -");
        for(Item item : items) System.out.print(item.getPrice()+" "+item.toString());
        
        return items;

    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine){
        throw new UnsupportedOperationException("This state doesn't support this operation");
    }

}
