package strategy.strategy_r;

public abstract class Compositor<T> {
    abstract int compose(Integer wordsCount, Integer lineBreaks, T component);
}
