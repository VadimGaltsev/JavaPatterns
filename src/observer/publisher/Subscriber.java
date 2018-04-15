package observer.publisher;

@FunctionalInterface
public interface Subscriber<T> {
    void dataChanged(T t);
}
