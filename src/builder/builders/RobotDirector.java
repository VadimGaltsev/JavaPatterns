package builder.builders;

import builder.Robot;

public class RobotDirector {

    private RobotBuilder mRobotBuilder;

    public void setRobotBuilder(RobotBuilder builder) {
        mRobotBuilder = builder;
    }

    public Robot getRobot() {
       return mRobotBuilder.getObject();
    }

    public RobotBuilder createRobot() {
        mRobotBuilder.createObject();
        return mRobotBuilder;
    }

}
