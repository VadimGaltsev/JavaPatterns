package bridge.concreteImpl;

import bridge.abstraction.RobotInterface;

public class RobotOnTheWater implements RobotInterface {
    @Override
    public void shootAction() {
        System.out.println("Piu piu piu");
    }

    @Override
    public void moveActions() {
        System.out.println("Swim driving");
    }
}
