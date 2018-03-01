package abstractFactory.robots;

public class AirRobot extends Robot {

    private int mWings;

    public AirRobot(String body, int weapons, int wings) {
        super(body, weapons);
        mWings = wings;
    }

    public int getWings() {
        return mWings;
    }

    public void setWings(int wings) {
        mWings = wings;
    }
}
