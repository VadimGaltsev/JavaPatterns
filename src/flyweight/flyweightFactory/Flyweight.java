package flyweight.flyweightFactory;

abstract class Flyweight<T extends Flyweight, C extends FlyweightContext<T>> {

    public C next(C context) {
        context.next();
        return context;
    }

    public C first(C context) {
        context.first();
        return context;
    }

    public C remove(C context) {
        context.remove();
        return context;
    }

    public C setCurrent(C context) {
        context._Flyweight = context.getCurrent();
        return context;
    }

    abstract<V extends C> V getContext(V context);


    abstract<V extends C> T action(V context);
}
