package factoryMethod.models;

public class City {

    private int mCitySize;
    private String state;


    public City(int citySize, String state) {
        mCitySize = citySize;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCitySize() {
        return mCitySize;
    }

    public void setCitySize(int citySize) {
        mCitySize = citySize;
    }
}
