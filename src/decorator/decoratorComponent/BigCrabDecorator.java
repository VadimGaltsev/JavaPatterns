package decorator.decoratorComponent;

public class BigCrabDecorator extends Decorator {

    public BigCrabDecorator(VisualComponent<CrabComponent> crabComponentVisualComponent) {
        super(crabComponentVisualComponent);
        drawCrab();
        crabComponentVisualComponent.drawCrab();
    }


    @Override
    public void drawCrab() {
        System.out.println("---------------big crab--------------");
    }
}
