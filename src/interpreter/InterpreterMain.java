package interpreter;

import interpreter.interpreter_pac.*;

public class InterpreterMain {
    public static void main(String[] args) {
        AppContext<AbstractExpression<Integer>, Integer> _appContext = new AppContext<>();
        VariableExp<Integer> exp_1 = new VariableExp<>();
        VariableExp<Integer> exp_2 = new VariableExp<>();
        MathActionPlus<Integer> _action = new MathActionPlus<Integer>(new MathActionsMinus<>(exp_1, exp_2),
                new MathActionPlus<>(new MathActionsMinus<>(exp_1, exp_2), new MathActionPlus<>(exp_1, exp_2)));
        _appContext.assign(exp_1, 7);
        _appContext.assign(exp_2, 70);
        System.out.println(_action.evaluate(_appContext));
    }
}
