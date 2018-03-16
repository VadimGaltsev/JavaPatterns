package facade.facadeImp;

import java.util.ArrayList;

public class CrabsLab extends Crab {

    private static ArrayList<Crab> mCrabs;

    CrabsLab() {
        super("lab");
        mCrabs = new ArrayList<>();
    }


    @Override
    public void crabEating() {
        System.out.println("Crab om-nom-nom");
    }

    @Override
    public Crab getCurrentCrab(int i) {
        return mCrabs.get(i);
    }

    @Override
    public boolean isCrabExist(Crab crab) {
        return mCrabs.contains(crab);
    }

    @Override
    public Crab getCurrentCrab() {
        return this;
    }

    protected void addCrab(String name) {
        mCrabs.add(new AwesomeCrab(name));
    }

    private static class AwesomeCrab extends Crab {

        public AwesomeCrab(String name) {
            super(name);
        }

        @Override
        public void crabEating() {
            System.out.println(getName() + " crab om om om");
        }

        @Override
        public Crab getCurrentCrab(int i) {
            return mCrabs.get(i);
        }

        @Override
        public boolean isCrabExist(Crab crab) {
            if (crab == this || this.equals(crab)) {
                return true;
            }
            return false;
        }

        @Override
        public Crab getCurrentCrab() {
            return this;
        }

        @Override
        public String getName() {
            return super.getName();
        }
    }
}
