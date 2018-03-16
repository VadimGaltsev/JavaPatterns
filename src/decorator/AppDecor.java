package decorator;

import decorator.decoratorComponent.BigCrabDecorator;
import decorator.decoratorComponent.CrabComponent;
import decorator.decoratorComponent.BorderedCrabDecorator;

public class AppDecor {

    public static void main(String[] args) {
        BigCrabDecorator decorator = new BigCrabDecorator(new BorderedCrabDecorator(new CrabComponent()));

        System.out.println("next decoration type 0----------->");

        BorderedCrabDecorator crabDecorator = new BorderedCrabDecorator(new BigCrabDecorator(new CrabComponent()));

    }

}
