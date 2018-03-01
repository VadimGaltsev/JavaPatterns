package abstractFactory;

import abstractFactory.robots.AirRobot;

public class AirRobotFactory implements AbstractRobotFactory<AirRobot> {

    @Override
    public AirRobot createEasyRobot() {
        return new AirRobot("easyAirRobotBody", 2, 2);
    }

    @Override
    public AirRobot createHardRobot() {
        return new AirRobot("hardAirProtectedBody", 4,4);
    }
}
