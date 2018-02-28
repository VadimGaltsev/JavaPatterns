package prototype;

public class Main {

    public static void main(String[] args) {
        RobotCloneable cloneable = new RobotCloneable();
        cloneable.setBody("TerminatorHead");
        cloneable.setArms(3);
        cloneable.setLegs(4);
        cloneable.setBody("AwesomeBody");
        RobotCloneable copy = cloneable.copy();
        RobotCloneable copy2 = cloneable.copy();

        System.out.println("Original: " + cloneable + ", body: " + cloneable.getBody() + ", Copy1: " + copy + ", body: "
        + copy.getBody() + ", Copy2: " + copy2 + ", body: " + copy2.getBody() + ",  " + " End this hell");
    }

}
