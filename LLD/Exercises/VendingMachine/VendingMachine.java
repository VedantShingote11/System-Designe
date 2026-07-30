package LLD.Exercises.VendingMachine;

import LLD.Exercises.VendingMachine.States.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    Inventory inventory;
    List<Coin> listCoins;
    List<String> itemList;
    
    State vendingMachineState;

    VendingMachine(){
        System.out.println("Currently Vending machine is in idle state");
        this.vendingMachineState = new Idle();
    }

    public void setInventory(){
        this.inventory = new Inventory();
    }

    public void setListCoins(){
        this.listCoins = new ArrayList<>();
    }

    public void setItemList(){
        this.itemList = new ArrayList<>();
    }

    public void setVendingMachineState(State state){
        this.vendingMachineState = state;
    }

    public State getVendingMachineState(){
        return vendingMachineState;
    }

    public List<Coin> getListCoins(){
        return listCoins;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public List<String> getItemList(){
        return itemList;
    }

    public void buyItem(String code){
        inventory.buyItem(code);
    }

    public Item getItem(String code){
        return inventory.getItem(code);
    }

    public int getCoinTotal(){
    
        int total=0;
        for(Coin coin : listCoins) total += coin.value;

        return total;

    }

    public int getItemTotal(){

        int total=0;
        for(String itemCode : itemList){
            total += getItem(itemCode).price;
        }

        return total;

    }

    // All state access methods

    public void pressAcceptCoinButton(VendingMachine vendingMachine){
        vendingMachine.getVendingMachineState().pressAcceptCoinButton(vendingMachine);
    }

    public void addCoin(VendingMachine vendingMachine , Coin coin){
        vendingMachine.getVendingMachineState().addCoin(vendingMachine, coin);
    }
    public void pressSelectItemButton(VendingMachine vendingMachine){
        vendingMachine.getVendingMachineState().pressSelectItemButton(vendingMachine);
    }

    public void addItem(VendingMachine vendingMachine , String code){
        vendingMachine.getVendingMachineState().addItem(vendingMachine, code);
    }
    public void pressDispenceItemButton(VendingMachine vendingMachine){
        vendingMachine.getVendingMachineState().pressDispenceItemButton(vendingMachine);
    }

    public List<Item> dispenceItems(VendingMachine vendingMachine){
        return vendingMachine.getVendingMachineState().dispenceItems(vendingMachine);
    }
    public List<Coin> returnChange(VendingMachine vendingMachine){
        return vendingMachine.getVendingMachineState().returnChange(vendingMachine);
    }

    public List<Coin> refund(VendingMachine vendingMachine){
        return vendingMachine.getVendingMachineState().refund(vendingMachine);
    }

}
