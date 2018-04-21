package visitor;

import visitor.visitor_pack.*;

public class VisitorMain {

    public static void main(String[] args) {
        VisitorNode<AClass> _aClassVisitor = new FieldVisitor<>();
        VisitorNode<BClass> _bClassVisitorNode = new MethodVisitor<>();
        AClass _a = new AClass();
        _a._Aclass = _a;
        _a._int = 3;
        _a._STRING = "hello";
        _aClassVisitor.visit(_a);
        _bClassVisitorNode.visit(new BClass());
    }
}
