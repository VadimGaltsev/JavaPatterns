package strategy.strategy_r;

public class WordCompositor<T> extends Compositor<T> {


    @Override
    int compose(Integer wordsCount, Integer lineBreaks, T component) {
        if (component == null) {
            return 0;
        }
        if (component instanceof String) {
            wordsCount = ((String) component).split("[\\s]").length;
            return wordsCount;
        }
        return 0;
    }
}
