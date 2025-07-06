package Behavioral.Null.Classes;

import Behavioral.Null.Interface.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Valid Car object is returned
        Vehicle car = VehicleFactory.getVehicleObject("CAR");
        printVehicleDetails(car);


        // Valid Bike object is returned
        Vehicle bike = VehicleFactory.getVehicleObject("BIKE");
        printVehicleDetails(bike);

        // Null Object is returned which gives us the default behaviour i.e. 0 for fuel capacity and 0 for seating capacity
        Vehicle vehicle = VehicleFactory.getVehicleObject("SCOOTY");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
            // Need not to check for if vehicle is null, as we handle the object from object factory and nullvehicle class
            System.out.println("Fuel capacity of "+vehicle.getName()+" is: " +vehicle.fuelTankCapacity());
            System.out.println("Seating capacity of "+vehicle.getName()+" is: " +vehicle.seatingCapacity());
    }
}
