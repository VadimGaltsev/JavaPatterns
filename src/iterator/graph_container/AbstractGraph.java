package iterator.graph_container;

public abstract class AbstractGraph {
    AbstractGraph _childs[];
    String _name;
    int position = 0;

    public AbstractGraph(int size, String _name) {
        this._childs = new AbstractGraph[size];
        this._name = _name;
    }

    public AbstractGraph(String _name) {
        this._name = _name;
    }

    public abstract AbstractGraph put(String s);
    public abstract AbstractGraph put(AbstractGraph abstractGraph);
    public abstract GraphIterator createIterator();
    public String get_name() {
        return _name;
    }

    public interface GraphIterator {
        String next();
        boolean whileNext();
    }

}
