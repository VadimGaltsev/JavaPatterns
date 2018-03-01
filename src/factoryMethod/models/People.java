package factoryMethod.models;

public class People {

    private int mCount;
    private String state;

    public People(int count, String s) {
        mCount = count;
        state = s;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        mCount = count;
    }
}
