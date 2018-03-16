package decorator.decoratorComponent;

abstract class Decorator implements VisualComponent<CrabComponent> {

    private VisualComponent<CrabComponent> mCrabComponentVisualComponent;

    Decorator(VisualComponent<CrabComponent> crabComponentVisualComponent) {
        mCrabComponentVisualComponent = crabComponentVisualComponent;
    }


}
