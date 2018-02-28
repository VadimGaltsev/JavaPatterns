package builder;

public class SimpleRobotBuilder extends RobotBuilder {


    @Override
    public SimpleRobotBuilder buildLegs(int legs) {
        mRobot.setLegs(legs);
        return this;
    }

    @Override
    public SimpleRobotBuilder buildArms(int arms) {
        mRobot.setArms(arms);
        return this;
    }

    @Override
    public SimpleRobotBuilder buildBody(String body) {
        mRobot.setBody(body);
        return this;
    }

    @Override
    public SimpleRobotBuilder buildHead(String head) {
        mRobot.setHead(head);
        return this;
    }
}
