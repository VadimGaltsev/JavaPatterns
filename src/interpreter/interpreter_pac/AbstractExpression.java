package interpreter.interpreter_pac;

public interface AbstractExpression<T> {
    T interpret(AppContext<AbstractExpression<T>, T> context);
    T evaluate(AppContext<AbstractExpression<T>, T> context);
}
