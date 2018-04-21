package strategy.strategy_r;

public class LineCompositor<T> extends Compositor<T> {


    @Override
    int compose(Integer wordsCount, Integer lineBreaks, T component) {
        if (component == null) {
            return 0;
        }
        if (component instanceof String) {
            return lineBreaks = ((String) component).split("[\\n]").length;
        } else {
            return 0;
        }
    }
}
