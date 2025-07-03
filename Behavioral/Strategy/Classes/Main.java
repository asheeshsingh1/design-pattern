package Behavioral.Strategy.Classes;

public class Main {
    public static void main(String[] args) {

        // This is known as strategy desgin pattern where this client code has got object of child class 
        // being calling drive method from parent class which would select the child class drive method 
        // based on the drive startegy, capability side se ek interface se lena aur apne parent class k 
        // constructor ko initialise krte hue de dena to make sure that we don't have same in code in 
        // subclass and also not in parent class which might restrict creating new subclasses.

        Vehicle vehicle = new NormalCar();
        vehicle.drive();

        Vehicle vehicle2 = new SportsCar();
        vehicle2.drive();

        Vehicle vehicle3 = new GoodsCar();
        vehicle3.drive();
    }
}
