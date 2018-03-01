package abstractFactory.robots;

public class GroundRobot extends Robot {

    private int mLegs;

    public GroundRobot(String body, int weapons, int legs) {
        super(body, weapons);
        mLegs = legs;
    }

    public int getLegs() {
        return mLegs;
    }

    public void setLegs(int legs) {
        mLegs = legs;
    }
}
