package adapter.adapteeSecond;

abstract class AdapterSecond implements AirRobotActions {

    RobotGround mRobot;

    protected AdapterSecond(RobotGround robot) {
        mRobot = robot;
    }

    @Override
    public void robotAirRun() {
        mRobot.robotRun();
    }

    @Override
    public void robotAirAttack() {
        mRobot.robotAttack();
    }
}
