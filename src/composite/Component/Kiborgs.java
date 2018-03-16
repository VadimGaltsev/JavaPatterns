package composite.Component;

public class Kiborgs extends Squad {

    public Kiborgs(String string) {
        super(string);
    }

    @Override
    public void Attack() {
        System.out.println("Kiborgs squad attack");
    }

    @Override
    public void addUnity(Unity unity) {
        super.addUnity(unity);
    }

    @Override
    public void removeUnity(Unity unity) {
        super.removeUnity(unity);
    }

    @Override
    public Unity getSquad(int id) {
        return super.getSquad(id);
    }
}
