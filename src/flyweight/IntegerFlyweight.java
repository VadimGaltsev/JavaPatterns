package flyweight;

import flyweight.flyweightFactory.Flyweight;

public class IntegerFlyweight extends Flyweight<Integer, IntegerContext> {

    private String externalState;

    IntegerFlyweight(Integer state, IntegerContext context) {
        super(state, context);
        context.putFlyweight(state, this);
    }

    public void setExternalState(String externalState) {
        this.externalState = externalState;
    }

    public String getExternalState() {
        return externalState;
    }

    @Override
    public void action(IntegerContext context) {
        System.out.println(externalState + " " + context.getState(this));
    }
}
