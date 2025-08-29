package Structural.Flyweight.Classes;

import Structural.Flyweight.Interface.Robot;

public class Main {
    public static void main(String[] args) {

        Robot humanRobot = RobotFactory.createRobot("HUMAN");
        humanRobot.display(1, 1);

        Robot humanRobot2 = RobotFactory.createRobot("HUMAN");
        humanRobot2.display(3, 1);

        Robot dogRobot = RobotFactory.createRobot("ROBODOG");
        dogRobot.display(3, 3);
    }
}
