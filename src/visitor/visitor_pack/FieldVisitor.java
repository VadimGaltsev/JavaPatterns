package visitor.visitor_pack;


import java.lang.reflect.Field;

public class FieldVisitor<T> extends VisitorNode<T> {

    @Override
    public void visit(T tClass) {
        Field[] _methods = tClass.getClass().getFields();
        for (Field _f : _methods) {
            System.out.printf("Field in class %1$s: %2$s \n", tClass.getClass().getName(), _f.getName());
            try {
                System.out.printf("Field value in class: %1$s \n", _f.get(tClass));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
