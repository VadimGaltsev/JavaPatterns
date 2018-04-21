package strategy.strategy_r;

public class Composition<T> {

    Compositor<T> _Compositor;
    Integer _componentCount;
    Integer _wordsCount;
    Integer _lineBreaks;
    T _Component;

    public Composition(Compositor<T> compositor) {
        _Compositor = compositor;
    }

    public void Repair() {
        System.out.println(_Compositor.compose(_wordsCount, _lineBreaks, _Component));
    }

    public void set_Component(T _Component) {
        this._Component = _Component;
    }
}
