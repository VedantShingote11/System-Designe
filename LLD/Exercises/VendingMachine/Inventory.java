package LLD.Exercises.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<ItemShelf> inventory;

    Inventory() {
        this.inventory = new ArrayList<>();
    }

    public void addShelf() {
        inventory.add(new ItemShelf());
    }

    public void addItem(int shelfNo, String code, Item item) {
        if (shelfNo > inventory.size()) {
            System.out.println("There is no shelf to add item");
            return;
        }

        inventory.get(shelfNo).shelf.put(code, item);
    }

    public void buyItem(String code) {

        for (ItemShelf shelf : inventory) {
            if (shelf.containsItem(code)) {
                shelf.buyItem(code);
            }
        }

    }

    public Item getItem(String code){

        for(ItemShelf shelf : inventory){
            if(shelf.containsItem(code)){
                return shelf.getItem(code);
            }
        }

        return null;
        
    }

    public void getAllItems(){

        for(ItemShelf shelf : inventory){
            shelf.getAllShelfItems();
        }
        
    }

}
