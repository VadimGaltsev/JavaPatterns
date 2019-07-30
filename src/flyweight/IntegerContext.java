package flyweight;

import flyweight.flyweightFactory.FlyweightContext;

import java.util.HashMap;
import java.util.Map;

public class IntegerContext extends FlyweightContext<Integer, IntegerFlyweight> {

    IntegerContext() {
        flyweights = new HashMap<>();
    }

    @Override
    public IntegerFlyweight getFlyweight(Integer state) {
        return flyweights.get(state);
    }

    @Override
    protected Integer getState(IntegerFlyweight flyWeight) {
        Integer state = 0;
        for (Map.Entry<Integer, IntegerFlyweight>  fl: flyweights.entrySet()) {
            if (fl.getValue() == flyWeight) {
                state = fl.getKey();
            }
        }
        return state;
    }
}
