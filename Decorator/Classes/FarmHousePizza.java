package Decorator.Classes;

import Decorator.AbstractClasses.BasePizza;

public class FarmHousePizza extends BasePizza{

    @Override
    public int cost() {
        return 200;
    }
}
