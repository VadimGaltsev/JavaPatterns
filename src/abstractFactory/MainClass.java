package abstractFactory;

import abstractFactory.robots.AirRobot;
import abstractFactory.robots.GroundRobot;

public class MainClass {
    public static void main(String[] args) {
        AirRobotFactory airRobotFactory = new AirRobotFactory();
        GroundRobotFactory groundRobotFactory = new GroundRobotFactory();
        AirRobot easyAirRobot = airRobotFactory.createEasyRobot();
        AirRobot hardAirRobot = airRobotFactory.createHardRobot();
        GroundRobot easyGroundRobot = groundRobotFactory.createEasyRobot();
        GroundRobot hardGroundRobot = groundRobotFactory.createHardRobot();
        System.out.printf("Robots created: %1$s, with body: %2$s \n", easyAirRobot, easyAirRobot.getBody());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", hardAirRobot, hardAirRobot.getBody());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", easyGroundRobot, easyGroundRobot.getBody());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", easyGroundRobot, hardGroundRobot.getBody());


    }

}
