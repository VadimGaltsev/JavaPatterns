package flyweight.flyweightFactory;

public abstract class
FlyweightFactory<S, F extends Flyweight<S, C>, C extends FlyweightContext<S, ? extends Flyweight<S, C>>> {

    protected C context;

    protected FlyweightFactory(C context) {
        this.context = context;
    }

    protected abstract F create(S state);

    public void switchContext(C context) {
        this.context = context;
    }
}
