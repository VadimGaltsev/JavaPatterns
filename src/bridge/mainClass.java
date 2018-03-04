package bridge;

import bridge.Robot.RobotTank;
import bridge.Robot.WaterRobot;
import bridge.concreteImpl.RobotOnTheGround;
import bridge.concreteImpl.RobotOnTheWater;

public class mainClass {

    public static void main(String[] args) {
        RobotTank tank = new RobotTank(new RobotOnTheGround());
        System.out.println("tankRobot created");
        tank.getRobotControll().moveActions();
        tank.getRobotControll().shootAction();
        WaterRobot waterRobot = new WaterRobot(new RobotOnTheWater());
        System.out.println("Water robot created");
        waterRobot.getRobotControll().moveActions();
        waterRobot.getRobotControll().shootAction();
        System.out.println("Transform Robot Tank");
        tank.transformRobotActions(new RobotOnTheWater());
        tank.getRobotControll().moveActions();
    }
}
