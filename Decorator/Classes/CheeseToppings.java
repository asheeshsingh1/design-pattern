package Decorator.Classes;

import Decorator.AbstractClasses.BasePizza;
import Decorator.AbstractClasses.BaseToppings;

public class CheeseToppings extends BaseToppings{
    BasePizza basePizza;
    int costCheeseToppings = 10;

    public CheeseToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + costCheeseToppings;
    }
    
}
