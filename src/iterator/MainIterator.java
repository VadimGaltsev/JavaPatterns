package iterator;

import iterator.graph_container.AbstractGraph;
import iterator.graph_container.Node;

public class MainIterator {
    public static void main(String[] args) {
        Node node = new Node(3, "Alice");
        node.put(new Node(2,"Bob").put("Carl").put(new Node(2, "Fara").put("Moly").put("Sonya")));
        node.put(new Node(1, "Derek").put("Gordon"));
        node.put(new Node(1, "Erick").put(new Node(2, "Horton").
                put(new Node(1, "Sam").put("Worth")).put("Polly")));
        System.out.println(node);
        AbstractGraph.GraphIterator graphIterator = node.createIterator();
        while (graphIterator.whileNext()) {
            System.out.println(graphIterator.next());
        }
    }
}
