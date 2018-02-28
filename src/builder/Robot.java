package builder;

public class Robot {

    private int mArms;
    private int mLegs;
    private String mBody;
    private String mHead;

    public void setArms(int arms) {
        mArms = arms;
    }

    public void setLegs(int legs) {
        mLegs = legs;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public void setHead(String head) {
        mHead = head;
    }

    public int getArms() {
        return mArms;
    }

    public int getLegs() {
        return mLegs;
    }

    public String getBody() {
        return mBody;
    }

    public String getHead() {
        return mHead;
    }
}
