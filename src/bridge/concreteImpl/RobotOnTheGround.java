package bridge.concreteImpl;

import bridge.abstraction.RobotInterface;

public class RobotOnTheGround implements RobotInterface {
    @Override
    public void shootAction() {
        System.out.println("Buuuh buuuuh");
    }

    @Override
    public void moveActions() {
        System.out.println("Cannot move");
    }
}
