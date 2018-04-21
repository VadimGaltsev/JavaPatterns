package visitor.visitor_pack;

import java.lang.reflect.Method;

public class MethodVisitor<T> extends VisitorNode<T> {

    @Override
    public void visit(T tClass) {
        Method[] _methods = tClass.getClass().getMethods();
        for (Method _m : _methods) {
            System.out.printf("Method in class %1$s: %2$s \n", tClass.getClass().getName(), _m.getName());
        }
    }
}
