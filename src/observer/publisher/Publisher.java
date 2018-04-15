package observer.publisher;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

abstract class Publisher<T> {
    private Set<Subscriber> _Sub_list = new HashSet<>();

    synchronized void notifySubscribers(T t) {
        _Sub_list.forEach(subscriber -> subscriber.dataChanged(t));
    }

    public synchronized void setSubsriber(Subscriber subsriber) {
        _Sub_list.add(subsriber);
    }
}
