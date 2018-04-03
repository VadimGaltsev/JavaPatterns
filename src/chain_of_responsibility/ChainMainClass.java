package chain_of_responsibility;

import chain_of_responsibility.chain_package.AnswerBase;
import chain_of_responsibility.chain_package.FilePathProvider;
import chain_of_responsibility.chain_package.QuizTip;

public class ChainMainClass {

    public static void main(String[] args) {
        getAnswerFromQuizTip();
        get_Answer_From_file_provider();
        _no_answer();

    }

    private static void getAnswerFromQuizTip() {
        FilePathProvider _file_Path_Provider = new FilePathProvider();
        AnswerBase<QuizTip> _answer_Base = new AnswerBase<>();
        QuizTip<FilePathProvider> _quiz_Tip = new QuizTip<>(_file_Path_Provider);
        try {
            _answer_Base.set_subscriber(_quiz_Tip).getAnswerForQuestion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void get_Answer_From_file_provider() {
        FilePathProvider _file_Path_Provider = new FilePathProvider();
        AnswerBase<QuizTip> _answer_Base = new AnswerBase<>();
        QuizTip<FilePathProvider> _quiz_Tip = new QuizTip<>(_file_Path_Provider);
        _quiz_Tip.startLongTask();
        try {
            _answer_Base.set_subscriber(_quiz_Tip).getAnswerForQuestion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void _no_answer() {
        FilePathProvider _file_Path_Provider = new FilePathProvider();
        AnswerBase<QuizTip> _answer_Base = new AnswerBase<>();
        _file_Path_Provider.startLongTask();
        QuizTip<FilePathProvider> _quiz_Tip = new QuizTip<>(_file_Path_Provider);
        _quiz_Tip.startLongTask();
        _quiz_Tip.startLongTask();
        try {
            _answer_Base.set_subscriber(_quiz_Tip).getAnswerForQuestion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
