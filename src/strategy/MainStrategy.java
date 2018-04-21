package strategy;

import strategy.strategy_r.Composition;
import strategy.strategy_r.LineCompositor;
import strategy.strategy_r.WordCompositor;

public class MainStrategy {
    public static void main(String[] args) {
        Composition<String> stringComposition = new Composition<>(new LineCompositor<>());
        Composition<String> stringComposition1 = new Composition<>(new WordCompositor<>());
        stringComposition.set_Component("Hello world\n" +
                "asdasd\n" +
                "asdasd\n" +
                "asdasd\n" +
                "asaaaaa\n");
        stringComposition1.set_Component("boo booo boo boob booooooo Alice Bob Count");
        stringComposition.Repair();
        stringComposition1.Repair();
    }
}
