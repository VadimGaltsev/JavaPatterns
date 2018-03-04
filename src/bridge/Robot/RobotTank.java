package bridge.Robot;

import bridge.abstraction.AbstractRobot;
import bridge.abstraction.RobotInterface;

public class RobotTank extends AbstractRobot {
    public RobotTank(RobotInterface robotInterface) {
        mRobotInterface = robotInterface;
    }

    public void transformRobotActions(RobotInterface robotInterface) {
        mRobotInterface = robotInterface;
    }
}
