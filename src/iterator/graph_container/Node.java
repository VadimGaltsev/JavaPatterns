package iterator.graph_container;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Node extends AbstractGraph {


    public Node(int connectors, String _name) {
        super(connectors, _name);
    }

    public Node(String _name) {
        super(_name);
    }

    @Override
    public AbstractGraph put(String s) {
        if (position < _childs.length) {
            _childs[position] = new Node(s);
            position++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this;
    }

    @Override
    public AbstractGraph put(AbstractGraph abstractGraph) {
        if (position < _childs.length) {
            _childs[position] = abstractGraph;
            position++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this;
    }

    @Override
    public GraphIterator createIterator() {
        return new GraphIterator() {
            private int _position = 0;
            private boolean _firstCall = true;
            private AbstractGraph last = Node.this;
            private Queue<AbstractGraph> _graphQeue = new LinkedBlockingQueue<>();
            @Override
            public String next() {
                if (_firstCall) {
                    _firstCall = false;
                    return last.get_name();
                } else {
                    if (_position < last._childs.length) {
                         String next = last._childs[_position].get_name();
                         AbstractGraph abstractGraph = last._childs[_position];
                         if (abstractGraph._childs != null) {
                             _graphQeue.add(abstractGraph);
                         }
                         _position++;
                         return next;
                    } else {
                        int len = last._childs.length;
                        _position = _position % len;
                        last = _graphQeue.poll();
                        return next();
                    }
                }
            }
            @Override
            public boolean whileNext() {
                if (_position < last._childs.length || _graphQeue.size() > 0)
                return true;
                else return false;
            }
        };
    }
}
