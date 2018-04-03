package flyweight.flyweightFactory;


public class Ship extends Flyweight<Ship, ShipContext> implements Comparable<Ship> {

    private int _Index;

    Ship(int _Index) {
        this._Index = _Index;
    }

    public int get_Index() {
        return _Index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return _Index == ship._Index;
    }

    @Override
    public int hashCode() {
        int code = (0b10101 | 0b01010) >> 2;
        code = code + _Index;
        return code;
    }

    @Override
    public int compareTo(Ship o) {
        return this._Index < o._Index ? -1 : 1;
    }

    @Override
    public <V extends ShipContext> V getContext(V context) {
        return context;
    }

    @Override
    <V extends ShipContext> Ship action(V context) {
        return context.getCurrent();
    }
}
