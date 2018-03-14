package composite.Component;

public interface Unity {
    void Attack();
    interface UnitySquad<T> extends Unity {
        void addUnity(Unity unity);
        void removeUnity(Unity unity);
        T getSquad(int id);
    }
}
