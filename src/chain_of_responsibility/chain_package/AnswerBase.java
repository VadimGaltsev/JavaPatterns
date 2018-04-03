package chain_of_responsibility.chain_package;


public class AnswerBase<T extends Handler> {
    private byte _BusyB = 1;
    private T _subscriber;
    public static String ANSWER_HELP = "Give answer for this looser";

    public AnswerBase<T> set_subscriber(T _subscriber) {
        this._subscriber = _subscriber;
        return this;
    }


    public void getAnswerForQuestion() throws Exception {
        if (_BusyB == 0) {
            System.out.println("AnswerBase: Answer is true");
            return;
        }
        if (_subscriber != null) {
            _subscriber.receiveMessage(ANSWER_HELP);
        } else {
            throw new Exception("Sorry, cannot find any subscriber");
        }
    }
}
