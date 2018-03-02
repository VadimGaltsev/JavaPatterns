package singleton;

public class SingletonSimple {

    private static SingletonSimple sSingletonSimple;

    public static synchronized SingletonSimple getInstance() {
        if (sSingletonSimple == null) {
            sSingletonSimple = new SingletonSimple();
        }
        return sSingletonSimple;
    }
}
