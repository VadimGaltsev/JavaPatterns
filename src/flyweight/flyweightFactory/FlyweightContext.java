package flyweight.flyweightFactory;

import java.util.TreeSet;

public abstract class FlyweightContext<T extends Flyweight> {
    TreeSet<T> _TreeFlySet;
    T _Flyweight;
    FlyweightContext() {
        _TreeFlySet = new TreeSet<>();
    }

    void next() {
        Flyweight flyweight = _TreeFlySet.higher(_Flyweight);
        if (flyweight != null) {
            _Flyweight = (T) flyweight;
        } else {
            _Flyweight = _TreeFlySet.last();
        }
    }

    void remove() {
        _TreeFlySet.remove(_Flyweight);
    }

    void first() {
        _Flyweight = _TreeFlySet.first();
    }

    public abstract T getCurrent();

}
