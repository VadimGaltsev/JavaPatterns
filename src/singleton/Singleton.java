package singleton;

public class Singleton {
    private static volatile Singleton sSingleton;

    public static Singleton getSingleton() {
        Singleton localSingleton = sSingleton;
        if (localSingleton == null) {
            synchronized (Singleton.class) {
                localSingleton = sSingleton;
                if (localSingleton == null) {
                    localSingleton = sSingleton = new Singleton();
                }
            }
        }
        return localSingleton;
    }
}
