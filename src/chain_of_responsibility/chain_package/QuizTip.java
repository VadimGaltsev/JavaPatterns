package chain_of_responsibility.chain_package;

public class QuizTip<T extends Handler> implements Handler {
    private boolean _Busy_Flag = false;
    private T _Subscriber;

    public QuizTip(T _Subscriber) {
        this._Subscriber = _Subscriber;
    }

    public void startLongTask() {
        _Busy_Flag = true;
    }

    @Override
    public void receiveMessage(String s) {
        if (s.equals(AnswerBase.ANSWER_HELP)) {
            if (!_Busy_Flag) {
                System.out.println("QuizTip say: Answer is true");
                return;
            }
            if (_Subscriber != null) {
                _Subscriber.receiveMessage(AnswerBase.ANSWER_HELP);
            }
        }
    }
}
