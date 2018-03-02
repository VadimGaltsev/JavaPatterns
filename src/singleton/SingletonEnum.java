package singleton;

public enum SingletonEnum {
    SINGLETON(1) {
        @Override
        void printSingleton() {
            System.out.println("Im here!" + number);
        }
    };
    int number;
    SingletonEnum(int p) {
        number = p;
    }

    abstract void printSingleton();

}
