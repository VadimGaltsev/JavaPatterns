package flyweight.flyweightFactory;

abstract class AbstractFlyweightFactory<G, F> {
    abstract F create(G i);
}
