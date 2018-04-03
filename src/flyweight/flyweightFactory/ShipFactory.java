package flyweight.flyweightFactory;

public class ShipFactory extends AbstractFlyweightFactory<Integer, Ship> {

    private FlyweightContext<Ship> __FlyweightContext;

    public ShipFactory(FlyweightContext<Ship> __FlyweightContext) {
        this.__FlyweightContext = __FlyweightContext;
    }

    @Override
    public Ship create(Integer i) {
        Ship ship = new Ship(i);
        __FlyweightContext._TreeFlySet.add(ship);
        __FlyweightContext._Flyweight = ship;
        return ship;
    }
}
