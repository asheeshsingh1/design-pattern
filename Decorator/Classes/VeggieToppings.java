package Decorator.Classes;

import Decorator.AbstractClasses.BasePizza;
import Decorator.AbstractClasses.BaseToppings;

public class VeggieToppings extends BaseToppings{
    BasePizza basePizza;
    int veggieToppingsCost = 20;
    
    public VeggieToppings(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + veggieToppingsCost;
    }
}
