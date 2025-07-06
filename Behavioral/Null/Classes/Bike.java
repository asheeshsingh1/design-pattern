package Behavioral.Null.Classes;

import Behavioral.Null.Interface.Vehicle;

public class Bike implements Vehicle{

    String name = "Bike";

    @Override
    public int seatingCapacity(){
        return 2;
    }

    @Override
    public int fuelTankCapacity(){
        return 10;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
