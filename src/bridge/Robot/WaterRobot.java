package bridge.Robot;

import bridge.abstraction.AbstractRobot;
import bridge.abstraction.RobotInterface;

public class WaterRobot extends AbstractRobot {
    public WaterRobot(RobotInterface robotInterface) {
        mRobotInterface = robotInterface;

    }

    public void transformRobotActions(RobotInterface robotInterface) {
        mRobotInterface = robotInterface;
    }
}
