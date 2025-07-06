package Behavioral.Null.Classes;

import Behavioral.Null.Interface.Vehicle;

public class NullVehicle implements Vehicle{

    String name = "None";

    public NullVehicle(){
        System.out.println("Null Object has been created please check your code once.");
    }

    @Override
    public int seatingCapacity() {
        return 0;
    }

    @Override
    public int fuelTankCapacity() {
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
