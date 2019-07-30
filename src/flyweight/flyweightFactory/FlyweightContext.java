package flyweight.flyweightFactory;

import java.util.Map;

public abstract class FlyweightContext<S, F extends Flyweight<S, ? extends FlyweightContext<S, F>>> {

    protected Map<S, F> flyweights;

    protected abstract F getFlyweight(S state);

    protected abstract S getState(F flyWeight);

    public Map<S, F> getFlyweights() {
        return flyweights;
    }

    public void putFlyweight(S state, F flyweight) {
        flyweights.put(state, flyweight);
    }
}
