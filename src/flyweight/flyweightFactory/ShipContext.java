package flyweight.flyweightFactory;

public class ShipContext extends FlyweightContext<Ship> {
    static float desk[][] = {
            {1f, 5f},{2f, 5f},{3f, 5f},
            {4f, 5f},{5f, 5f},{5f, 1f},
            {5f, 2f},{5f, 3f},{5f, 4f}
    };

    private int _ptrX;

    {
        _ptrX = 0;
    }

    @Override
    void next() {
        super.next();
        _ptrX = (_ptrX + 1) % desk.length;
    }

    @Override
    public Ship getCurrent() {
        return _Flyweight;
    }

    public float[] getCoordinates() {
        float[] arr = new float[2];
        arr[0] = desk[_ptrX][0];
        arr[1] = desk[_ptrX][1];
        return arr;
    }


}
