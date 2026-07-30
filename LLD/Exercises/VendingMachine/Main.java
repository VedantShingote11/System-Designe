package LLD.Exercises.VendingMachine;

import LLD.Exercises.VendingMachine.States.Idle;

public class Main {
    public static void main(String[] args) {
        
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.setInventory();
        vendingMachine.setItemList();
        vendingMachine.setListCoins();

        vendingMachine.inventory.addShelf();
        vendingMachine.inventory.addShelf();

        vendingMachine.inventory.addItem(0, "101", new Item(ItemType.CHOCLATE_BAR, 25));
        vendingMachine.inventory.addItem(1, "201", new Item(ItemType.SODA, 10));

        vendingMachine.inventory.getAllItems();

        vendingMachine.setVendingMachineState(new Idle());
        
        System.out.println("User starts buying item ");

        System.out.println("User press add coin button");
        vendingMachine.pressAcceptCoinButton(vendingMachine);

        System.out.println("User adds coin ");
        vendingMachine.addCoin(vendingMachine, Coin.TEN);
        vendingMachine.addCoin(vendingMachine, Coin.TEN);
        vendingMachine.addCoin(vendingMachine, Coin.TEN);

        System.out.println("User press select item button");
        vendingMachine.pressSelectItemButton(vendingMachine);

        System.out.println("User select item to buy");
        vendingMachine.addItem(vendingMachine, "101");

        System.out.println("User press dispence item button");
        vendingMachine.pressDispenceItemButton(vendingMachine);

        System.out.println("User gets items & change amount");
        vendingMachine.returnChange(vendingMachine);
        vendingMachine.dispenceItems(vendingMachine);

    }
}
