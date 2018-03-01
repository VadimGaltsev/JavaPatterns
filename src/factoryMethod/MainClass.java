package factoryMethod;

import factoryMethod.killers.KillersFactory;
import factoryMethod.killers.Robot;
import factoryMethod.models.City;
import factoryMethod.models.People;

public class MainClass {

    public static void main(String[] args) {
        KillersFactory factory = new KillersFactory();
        City city = new City(500, "alive");
        People people = new People(4, "alive");
        System.out.printf("City now: %1$s, people now: %2$s \n", city.getState(), people.getState());
        System.out.printf("City now: %1$s, people now: %2$s \n", city.getCitySize(), people.getCount());
        Robot peopleKiller = factory.createKiller(people);
        Robot cityDestr = factory.createKiller(city);
        peopleKiller.killPeople();
        cityDestr.killPeople();
        System.out.println("Killers here");
        System.out.printf("City now: %1$s, people now: %2$s \n", city.getState(), people.getState());
        System.out.printf("City now: %1$s, people now: %2$s \n", city.getCitySize(), people.getCount());

    }


}
