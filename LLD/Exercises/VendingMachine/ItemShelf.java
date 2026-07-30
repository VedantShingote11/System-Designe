package LLD.Exercises.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class ItemShelf{

    Map<String , Item> shelf;

    ItemShelf(){
        this.shelf = new HashMap<>();
    }

    public boolean containsItem(String code){
        return shelf.containsKey(code) && (shelf.get(code) != null);
    }

    public void addItem(String code , Item item){
        shelf.put(code, item);
    }

    public void buyItem(String code){
        shelf.put(code, null);
    }

    public Item getItem(String code){
        return shelf.get(code);
    }

    public void getAllShelfItems(){
        System.out.print("[ ");
        for(String code : shelf.keySet()){
            System.out.print(code+" "+getItem(code).toString()+" ");
        }
        System.out.print(" ]");
        System.out.println();
    }

}