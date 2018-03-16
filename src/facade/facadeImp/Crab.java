package facade.facadeImp;

public abstract class Crab implements CrabsActions<Crab> {

    private String mName;

    Crab(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
