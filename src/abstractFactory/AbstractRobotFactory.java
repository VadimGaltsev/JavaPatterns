package abstractFactory;

import abstractFactory.robots.Robot;

public interface AbstractRobotFactory<T extends Robot> {

    T createEasyRobot();
    T createHardRobot();
}
