package interpreter.interpreter_pac;

public class VariableExp<T> implements AbstractExpression<T> {

    @Override
    public T interpret(AppContext<AbstractExpression<T>, T> context) {
        return context.look_up(this);
    }

    @Override
    public T evaluate(AppContext<AbstractExpression<T>, T> context) {
        return context.look_up(this);
    }
}
