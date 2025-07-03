package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;
import Creational.AbstractFactory.Interface.VehicleFactory;

public class LuxuryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch (vehicleName) {
            case "MERCEDES":
                return new Mercedes();
            case "BMW":
                return new BMW();
            default:
                return null;
        }
    }

}
