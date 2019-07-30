package flyweight;

public class MainFlyClass {

    public static void main(String[] args) {
        IntegerContext littleContext = new IntegerContext();
        IntegerContext bigContext = new IntegerContext();
        IntegerFlyweightFactory flyweightFactory = new IntegerFlyweightFactory(littleContext);
        IntegerFlyweight flyweight = flyweightFactory.create(1);
        IntegerFlyweight flyweight_2 = flyweightFactory.create(1);
        flyweight.setExternalState("Число");
        flyweight_2.setExternalState("Chislo");
        flyweightFactory.switchContext(bigContext);
        flyweightFactory.create(123123);
        flyweight.action(littleContext);
        flyweight.action(bigContext);
    }
}
