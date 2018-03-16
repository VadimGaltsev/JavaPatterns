package decorator.decoratorComponent;

public class BorderedCrabDecorator extends Decorator {

    public BorderedCrabDecorator(VisualComponent<CrabComponent> crabComponentVisualComponent) {
        super(crabComponentVisualComponent);
        drawCrab();
        crabComponentVisualComponent.drawCrab();
    }

    @Override
    public void drawCrab() {
        System.out.println("--------------------------------------");
    }
}
