package Decorator.Classes;

import Decorator.AbstractClasses.BasePizza;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new CheeseToppings(new FarmHousePizza());
        Integer cost = basePizza.cost();
        System.out.println("Pizza cost is: " + cost);

        BasePizza basePizza2 = new VeggieToppings(new CheeseToppings(new FarmHousePizza()));
        Integer cost2 = basePizza2.cost();
        System.out.println("Pizza cost is: " + cost2);
    }
}
