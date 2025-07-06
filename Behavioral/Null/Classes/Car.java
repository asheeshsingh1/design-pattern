package Behavioral.Null.Classes;

import Behavioral.Null.Interface.Vehicle;

public class Car implements Vehicle{

    String name = "Car";

    @Override
    public int seatingCapacity() {
        return 5;
    }

    @Override
    public int fuelTankCapacity() {
        return 50;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
