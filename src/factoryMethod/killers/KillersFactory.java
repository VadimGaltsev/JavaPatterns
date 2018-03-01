package factoryMethod.killers;

import factoryMethod.models.City;
import factoryMethod.models.People;

public class KillersFactory<T> {

    public Robot createKiller(T meat) {
        Robot robot = null;
        if (meat instanceof City) {
            robot = new CityDestroyer((City) meat);
        } else if (meat instanceof People) {
            robot = new PeopleKiller((People) meat);
        }
        return robot;
    }

}
