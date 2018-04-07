package interpreter.interpreter_pac;

import java.util.HashMap;

public class AppContext<T extends AbstractExpression<V>, V> {

    private HashMap<T, V> _Expression_map;

    public AppContext() {
        this._Expression_map = new HashMap<>();
    }

    V look_up(T s) {
        return _Expression_map.get(s);
    }

    public void assign(T s, V v) {
        _Expression_map.put(s, v);
    }

}
