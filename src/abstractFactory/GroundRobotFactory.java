package abstractFactory;

import abstractFactory.robots.GroundRobot;

public class GroundRobotFactory implements AbstractRobotFactory<GroundRobot> {

    @Override
    public GroundRobot createEasyRobot() {
        return new GroundRobot("easyGroundBody", 2,2);
    }

    @Override
    public GroundRobot createHardRobot() {
        return new GroundRobot("hardGroundProtectedBody", 4,4);
    }
}
