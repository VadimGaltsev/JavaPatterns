package builder;

public interface Builder<T> {

    T createObject();
    T getObject();
}
