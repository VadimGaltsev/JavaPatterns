package builder.builders;
import builder.Robot;

public abstract class RobotBuilder extends Builder<Robot> {

    protected Robot mRobot;

    @Override
    protected Robot createObject() {
        return mRobot = new Robot();
    }

    @Override
    protected Robot getObject() {
        return mRobot;
    }

    public abstract RobotBuilder buildLegs(int legs);
    public abstract RobotBuilder buildArms(int arms);
    public abstract RobotBuilder buildBody(String body);
    public abstract RobotBuilder buildHead(String head);
    public abstract Robot build();
}
