package chain_of_responsibility.chain_package;

public class FilePathProvider implements Handler{
    private boolean _Busy_Flag = false;

    public void startLongTask() {
        _Busy_Flag = true;
    }

    @Override
    public void receiveMessage(String s) {
        if (s.equals(AnswerBase.ANSWER_HELP)) {
            if (!_Busy_Flag) {
                System.out.println("FilePathProvider say: Answer is true");
                return;
            }
            System.out.println("FilePathProvider say: Sorry, i cannot find answer, may be 42?");
        }
    }
}
