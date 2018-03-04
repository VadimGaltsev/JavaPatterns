package bridge.Robot;

import bridge.abstraction.AbstractRobot;
import bridge.abstraction.RobotInterface;

public class WaterRobot extends AbstractRobot {
    public WaterRobot() {
    }

    public void transformRobotActions(RobotInterface robotInterface) {
        mRobotInterface = robotInterface;
    }
}
