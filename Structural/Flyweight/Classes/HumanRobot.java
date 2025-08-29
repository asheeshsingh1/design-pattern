package Structural.Flyweight.Classes;

import Structural.Flyweight.Interface.Robot;

public class HumanRobot implements Robot{
    String type;
    String body;

    public HumanRobot(String type, String body){
        this.body = body;
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("This is Human Robot with X: " + x + " and Y: " + y);
    }
    
}
