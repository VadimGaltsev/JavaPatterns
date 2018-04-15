package observer;

import observer.publisher.Compucter;
import observer.publisher.Display;
import observer.publisher.Subscriber;

public class MainObserver {
    public static void main(String[] args) {
        Compucter compucter = new Compucter();
        Display display = new Display();
        Display display1 = new Display();
        compucter.setSubsriber((Subscriber<Compucter>) compucter1 -> {
            display.setData(compucter1.get_Data());
            display1.setData(compucter1.get_Data());
        });

        compucter.set_Data("new data");
        System.out.printf("now data: %1$s, %2$s, %3$s \n", compucter.get_Data(), display.getData(), display1.getData());
        compucter.set_Data("load data");
        System.out.printf("now data: %1$s, %2$s, %3$s \n", compucter.get_Data(), display.getData(), display1.getData());
    }
}
