package composite.Component;

import java.util.ArrayList;

abstract class Squad implements Unity, Unity.UnitySquad {

    private ArrayList<Unity> mUnities = new ArrayList<>();
    private String mString;

    Squad(String string) {
        mString = string;
    }

    @Override
    public void addUnity(Unity unity) {
        mUnities.add(unity);
    }

    @Override
    public void removeUnity(Unity unity) {
        mUnities.remove(unity);
    }

    @Override
    public void Attack() {
        System.out.println("squad attack");
    }

    @Override
    public Unity getSquad(int id) {
        return mUnities.get(id);
    }
}
