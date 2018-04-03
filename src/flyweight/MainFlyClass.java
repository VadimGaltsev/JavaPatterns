package flyweight;

import flyweight.flyweightFactory.Ship;
import flyweight.flyweightFactory.ShipContext;
import flyweight.flyweightFactory.ShipFactory;

import java.util.Arrays;

public class MainFlyClass {

    public static void main(String[] args) {
        ShipContext context = new ShipContext();
        ShipFactory shipFactory = new ShipFactory(context);
        shipFactory.create(4);
        Ship ship2 = shipFactory.create(2);
        Ship ship1 = shipFactory.create(10);
        System.out.println(ship1.get_Index());
        Ship ship3 = ship1.first(context).getCurrent();
        System.out.println(ship3.get_Index() + " " + Arrays.toString(ship3.setCurrent(context).getCoordinates()));
        ship1 = ship1.next(context).getCurrent();
        System.out.println(ship1.get_Index() + " " + Arrays.toString(ship1.getContext(context).getCoordinates()));
        ship2 = ship1.next(context).getCurrent();
        System.out.println(ship2.get_Index());
        ship2 = ship1.next(context).getCurrent();
        System.out.println(ship2.get_Index());

    }
}
