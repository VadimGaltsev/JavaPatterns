package facade.facadeImp;

public class CrabsFacade {

    private static CrabsLab mCrabsLab;

    public CrabsFacade() {

    }

    public CrabsLab getCrabs() {
        CrabsLab crabsLab = mCrabsLab;
        if (crabsLab == null) {
            crabsLab = mCrabsLab = new CrabsLab();
        }
        return crabsLab;
    }

    public void addCrab(String name) {
        mCrabsLab.addCrab(name);
    }

    public boolean isCrabExist(Crab crab) {
        return mCrabsLab.isCrabExist(crab);
    }

}
