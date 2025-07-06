package Behavioral.Null.Classes;

import Behavioral.Null.Interface.Vehicle;

public class VehicleFactory {
    static  Vehicle getVehicleObject(String vehicle){
        switch (vehicle) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            default:
                return new NullVehicle();
        }
    }
}
