package builder;

public abstract class RobotBuilder implements Builder<Robot> {

    protected Robot mRobot;

    @Override
    public Robot createObject() {
        return mRobot = new Robot();
    }

    @Override
    public Robot getObject() {
        return mRobot;
    }

    public abstract RobotBuilder buildLegs(int legs);
    public abstract RobotBuilder buildArms(int arms);
    public abstract RobotBuilder buildBody(String body);
    public abstract RobotBuilder buildHead(String head);
}
