package DecoratorDesignePattern;

import DecoratorDesignePattern.Pizzas.BasePizza;
import DecoratorDesignePattern.Pizzas.MargaritaPizza;
import DecoratorDesignePattern.Toppings.ExtraCheeseDecorator;
import DecoratorDesignePattern.Toppings.MashroomDecorator;

public class Counter {
    public static void main(String[] args) {
        
        BasePizza margeritaWithMashroom = new ExtraCheeseDecorator(new MashroomDecorator(new MargaritaPizza()));
        
        System.out.println(margeritaWithMashroom.cost());

    }
}
