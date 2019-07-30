package flyweight.flyweightFactory;

public abstract class Flyweight<S, C extends FlyweightContext<S, ? extends Flyweight<S, C>>> {

    protected Flyweight(S state, C context) {

    }

    public abstract void action(C context);
}
