package bridge;

import bridge.Robot.RobotTank;
import bridge.Robot.WaterRobot;
import bridge.concreteImpl.RobotOnTheGround;
import bridge.concreteImpl.RobotOnTheWater;

public class mainClass {

    public static void main(String[] args) {
        RobotTank tank = new RobotTank();
        System.out.println("tankRobot created");
        tank.setRobotActions(new RobotOnTheGround());
        tank.getRobotControll().moveActions();
        tank.getRobotControll().shootAction();
        WaterRobot waterRobot = new WaterRobot();
        System.out.println("Water robot created");
        waterRobot.setRobotActions(new RobotOnTheWater());
        waterRobot.getRobotControll().moveActions();
        waterRobot.getRobotControll().shootAction();
        System.out.println("Transform Robot Tank");
        tank.transformRobotActions(new RobotOnTheWater());
        tank.getRobotControll().moveActions();
    }
}
