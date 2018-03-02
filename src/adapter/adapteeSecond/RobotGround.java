package adapter.adapteeSecond;

public class RobotGround implements RobotActions {
    @Override
    public void robotRun() {
        System.out.println("Robot start running");
    }

    @Override
    public void robotAttack() {
        System.out.println("robot attack!!!");
    }
}
