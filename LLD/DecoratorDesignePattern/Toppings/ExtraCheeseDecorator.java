package DecoratorDesignePattern.Toppings;

import DecoratorDesignePattern.Pizzas.BasePizza;

public class ExtraCheeseDecorator extends ToppingDecorator {

    BasePizza basePizza;
    public ExtraCheeseDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 20;
    }

}
