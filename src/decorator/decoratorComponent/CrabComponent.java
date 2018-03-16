package decorator.decoratorComponent;

public class CrabComponent implements VisualComponent<CrabComponent> {


    @Override
    public void drawCrab() {
        System.out.println("Crab _-_0_o_-_");
    }
}
