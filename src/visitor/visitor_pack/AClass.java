package visitor.visitor_pack;

public class AClass {
    public String _STRING;
    public int _int;
    public AClass _Aclass;

    public void accept(VisitorNode<AClass> classVisitorNode) {
        classVisitorNode.visit(this);
    }
}
