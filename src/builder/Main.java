package builder;

import builder.builders.RobotBuilder;
import builder.builders.RobotDirector;
import builder.builders.SimpleRobotBuilder;

public class Main {

    public static void main(String... arg) {
        SimpleRobotBuilder simpleRobotBuilder = new SimpleRobotBuilder();
        RobotDirector robotDirector = new RobotDirector();
        robotDirector.setRobotBuilder(simpleRobotBuilder);
        Robot robot = robotDirector.createRobot().buildArms(1).buildLegs(2)
                .buildHead("head").buildBody("simpleBody").build();
        Robot robot1 = robotDirector.getRobot();
        System.out.println(robot);
        System.out.println(robot1);

    }


}
