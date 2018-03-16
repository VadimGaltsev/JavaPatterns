package facade.facadeImp;

public interface CrabsActions<T> {
    void crabEating();
    T getCurrentCrab(int i);
    boolean isCrabExist(T t);
    T getCurrentCrab();
}
