package composite.Component;

public class RobotsArmy extends Army implements Unity {

    public RobotsArmy(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("Robots army attack");
    }

}
