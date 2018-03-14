package composite.Component;

import java.util.ArrayList;

abstract class Army implements Unity.UnitySquad {

    ArrayList<Unity> mUnities = new ArrayList<>();
    String mName;

    Army(String name) {
        mName = name;
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
    public UnitySquad getSquad(int id) {
        return (UnitySquad) mUnities.get(id);
    }
}
