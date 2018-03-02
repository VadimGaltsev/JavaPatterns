package adapter;

import adapter.adaptee.Adapter;
import adapter.adapteeSecond.RobotAir;
import adapter.adapteeSecond.RobotGround;

public class MainClass {

    public static void main(String[] args) {
//        Adapter adapter = new Adapter();
//        adapter.setJFrameBounds(500, 300);

        RobotGround ground = new RobotGround();
        RobotAir air = new RobotAir(ground);
        System.out.printf("RobotAir: %s action: ", air);
        air.robotAirAttack();
        air.robotAirRun();
        System.out.printf("RobotGround: %s action: ", ground);
        ground.robotAttack();
        ground.robotRun();
    }
}
