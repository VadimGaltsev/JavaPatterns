package prototype;

public class RobotCloneable implements Prototype<RobotCloneable> {

    private int mArms;
    private int mLegs;
    private String mBody;
    private String mHead;

    public RobotCloneable() {

    }

    public int getArms() {
        return mArms;
    }

    public void setArms(int arms) {
        mArms = arms;
    }

    public int getLegs() {
        return mLegs;
    }

    public void setLegs(int legs) {
        mLegs = legs;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public String getHead() {
        return mHead;
    }

    public void setHead(String head) {
        mHead = head;
    }

    @Override
    public RobotCloneable copy() {
        RobotCloneable robotCloneable = new RobotCloneable();
        robotCloneable.setArms(this.getArms());
        robotCloneable.setBody(this.getBody());
        robotCloneable.setLegs(this.getLegs());
        robotCloneable.setHead(this.getHead());
        return robotCloneable;
    }
}
