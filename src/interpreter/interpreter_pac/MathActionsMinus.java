package interpreter.interpreter_pac;

public class MathActionsMinus<T> implements AbstractExpression<T> {
    private AbstractExpression<T> _firstExp;
    private AbstractExpression<T> _secondExp;

    public MathActionsMinus(AbstractExpression<T> _firstExp, AbstractExpression<T> _secondExp) {
        this._firstExp = _firstExp;
        this._secondExp = _secondExp;
    }

    @Override
    public T interpret(AppContext<AbstractExpression<T>, T> context) {
        return context.look_up(this);
    }

    @Override
    public T evaluate(AppContext<AbstractExpression<T>, T> context) {
        if (_firstExp.evaluate(context) instanceof Integer &&
                _secondExp.evaluate(context) instanceof Integer) {
            Integer first = (Integer) _firstExp.evaluate(context);
            Integer second = (Integer) _secondExp.evaluate(context);
            Integer result = first - second;
            return (T) result;
        }
        return context.look_up(this);    }
}
