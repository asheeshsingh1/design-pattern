package Structural.Decorator.Classes;

import Structural.Decorator.AbstractClasses.BasePizza;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new CheeseToppings(new FarmHousePizza());
        Integer cost = basePizza.cost();
        System.out.println("Pizza cost is: " + cost);

        BasePizza basePizza2 = new VeggieToppings(new CheeseToppings(new FarmHousePizza()));
        Integer cost2 = basePizza2.cost();
        System.out.println("Pizza cost is: " + cost2);

        BasePizza basePizza3 = new VeggieToppings(new CheeseToppings(new CapsicumPizza()));
        Integer cost3 = basePizza3.cost();
        System.out.println("Pizza cost is: " + cost3);

        BasePizza basePizza4 = new VeggieToppings(new CheeseToppings(new VegDelightPizza()));
        Integer cost4 = basePizza4.cost();
        System.out.println("Pizza cost is: " + cost4);
    }
}
