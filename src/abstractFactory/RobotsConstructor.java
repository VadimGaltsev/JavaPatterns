package abstractFactory;


import abstractFactory.robots.Robot;

public class RobotsConstructor {

    public <V extends AbstractRobotFactory> Robot[] createRobots(V t) {
        Robot t1 = t.createEasyRobot();
        Robot t2 = t.createHardRobot();
        return new Robot[] {t1, t2};
    }
}
