package Structural.Flyweight.Classes;

import java.util.HashMap;
import Structural.Flyweight.Interface.Robot;

public class RobotFactory {
    static HashMap<String,Robot> robotCache = new HashMap<>();

    public static Robot createRobot(String robotType){
        if(robotCache.containsKey(robotType)){
            return robotCache.get(robotType);
        }

        if(robotType.equals("HUMAN")){
            String bodyRobot = "THIN";
            Robot humanRobotObject = new HumanRobot(robotType,bodyRobot);
            robotCache.put(robotType, humanRobotObject);
            return humanRobotObject;
        }
        else if(robotType.equals("ROBODOG")){
            String bodyRobot = "THIN";
            Robot humanRobotObject = new DogRobot(robotType,bodyRobot);
            robotCache.put(robotType, humanRobotObject);
            return humanRobotObject;
        }
        return null;
    }
}