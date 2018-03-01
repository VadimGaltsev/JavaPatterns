package abstractFactory.robots;

public abstract class Robot{

    private int mWeapons;
    private String mBody;

    public Robot(String body, int weapons) {
        mWeapons = weapons;
        mBody = body;
    }

    public int getWeapons() {
        return mWeapons;
    }

    public void setWeapons(int weapons) {
        mWeapons = weapons;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }
}
