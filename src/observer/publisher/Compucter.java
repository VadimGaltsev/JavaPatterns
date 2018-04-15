package observer.publisher;

public class Compucter extends Publisher<Compucter> {

    private String _Data;
    private int _Num;

    public String get_Data() {
        return _Data;
    }

    public int get_Num() {
        return _Num;
    }

    public void set_Data(String _Data) {
        this._Data = _Data;
        notifySubscribers(this);
    }

    public void set_Num(int _Num) {
        this._Num = _Num;
        notifySubscribers(this);
    }
}
