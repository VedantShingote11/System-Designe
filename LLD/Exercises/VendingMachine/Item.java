package LLD.Exercises.VendingMachine;

public class Item{
    
    ItemType type;
    int price;

    Item(ItemType type , int price){
        this.type = type;
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }

    public ItemType getItemType(){
        return type;
    }
}