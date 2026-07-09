package DecoratorDesignePattern.Toppings;

import DecoratorDesignePattern.Pizzas.BasePizza;

public class MashroomDecorator extends ToppingDecorator{
    
    BasePizza basePizza;

    public MashroomDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 50;
    }

}
