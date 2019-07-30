package flyweight;

import flyweight.flyweightFactory.FlyweightFactory;

public class IntegerFlyweightFactory extends FlyweightFactory<Integer, IntegerFlyweight, IntegerContext> {

    public IntegerFlyweightFactory(IntegerContext integerContext) {
        super(integerContext);
    }

    @Override
    public IntegerFlyweight create(Integer state) {
        if (context.getFlyweights().containsKey(state)) {
            return context.getFlyweight(state);
        }
        return new IntegerFlyweight(state, context);
    }
}
