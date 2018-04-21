package visitor.visitor_pack;

public class BClass {
    public void printSmthng() {

    }

    public void sayHello() {

    }

    protected int sayNum() {
        return 0;
    }

    public void accept(VisitorNode<BClass> classVisitorNode) {
        classVisitorNode.visit(this);
    }
}
