package bridge.abstraction;

public abstract class AbstractRobot {

    protected RobotInterface mRobotInterface;

    public void setRobotActions(RobotInterface robotActions) {
        mRobotInterface = robotActions;
    }

    public RobotInterface getRobotControll() {
        return mRobotInterface;
    }

}
