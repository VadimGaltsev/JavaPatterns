package templateMethod.template_Classes;

public class ConcreteB extends Abstract {
    public ConcreteB(Abstract a) {
        super(a);
    }

    @Override
    public void printF() {
        System.out.println("ConcreteB here, hello!");
    }
}
