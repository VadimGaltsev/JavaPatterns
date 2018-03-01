package abstractFactory;

public interface AbstractRobotFactory<T> {

    T createEasyRobot();
    T createHardRobot();
}
