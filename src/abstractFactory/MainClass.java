package abstractFactory;

import abstractFactory.robots.AirRobot;
import abstractFactory.robots.GroundRobot;
import abstractFactory.robots.Robot;

public class MainClass {
    public static void main(String[] args) {
        RobotsConstructor constructor = new RobotsConstructor();
        Robot[] robots = constructor.createRobots(new GroundRobotFactory());
        Robot[] airRobots = constructor.createRobots(new AirRobotFactory());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", airRobots[0], airRobots[0].getBody());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", airRobots[1], airRobots[1].getBody());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", robots[0], robots[0].getBody());
        System.out.printf("Robots created: %1$s, with body: %2$s \n", robots[1], robots[1].getBody());


    }

}
